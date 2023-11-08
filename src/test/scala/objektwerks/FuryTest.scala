package objektwerks

import io.fury.Fury

import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

final case class Person(id: Int, name: String, age: Int)

final class FuryTest extends AnyFunSuite with Matchers:
  val fury = Fury
    .builder
    .withScalaOptimizationEnabled(true)
    .requireClassRegistration(false)
    .withRefTracking(true)
    .build

  test("fury"):
    val person = Person(id = 1, name = "Fred Flintstone", 24)
    val serializedPerson = fury.serialize(person)
    val deserializedPerson = fury.deserialize(serializedPerson)
    person shouldBe deserializedPerson