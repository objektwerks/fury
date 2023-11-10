package objektwerks

import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

final class FuryTest extends AnyFunSuite with Matchers:
  test("case class"):
    val person = Person.newPerson
    val serializedPerson = Person.serialize(person)
    val deserializedPerson = Person.deserialize(serializedPerson)
    person shouldBe deserializedPerson

  test("list of case classes"):
    val persons = Person.newPersons
    val serializedPersons = Person.serialize(persons)
    val deserializedPersons = Person.deserialize(serializedPersons)
    persons shouldBe deserializedPersons