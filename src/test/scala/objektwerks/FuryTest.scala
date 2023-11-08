package objektwerks

import io.fury.Fury

import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

enum Gender:
  case Female, Male

final case class Person(id: Int,
                        name: String,
                        age: Int,
                        gender: Gender = Gender.Male,
                        tribe: Option[String])

final class FuryTest extends AnyFunSuite with Matchers:
  val fury = Fury
    .builder
    .withScalaOptimizationEnabled(true)
    .requireClassRegistration(false)
    .withRefTracking(true)
    .build

  test("case class"):
    val person = Person(id = 1, name = "Fred Flintstone", age = 24, tribe = Some("stone"))
    val serializedPerson = fury.serialize(person)
    val deserializedPerson = fury.deserialize(serializedPerson)
    person shouldBe deserializedPerson

  test("list of case classes"):
    val persons = List(
      Person(id = 1, name = "Fred Flintstone", age = 24, tribe = Some("stone")),
      Person(id = 2, name = "Barney Rubble", age = 21, tribe = Some("stone"))
    )
    val serializedPersons = fury.serialize(persons)
    val deserializedPersons = fury.deserialize(serializedPersons)
    persons shouldBe deserializedPersons