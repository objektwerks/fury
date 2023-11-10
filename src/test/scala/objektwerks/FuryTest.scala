package objektwerks

import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

final class FuryTest extends AnyFunSuite with Matchers:
  test("case class"):
    val person = Person.newPerson
    val serializedPerson = Store.serialize(person)
    val deserializedPerson = Store.deserialize(serializedPerson)
    person shouldBe deserializedPerson

  test("list of case classes"):
    val persons = Person.newPersons
    val serializedPersons = Store.serialize(persons)
    val deserializedPersons = Store.deserialize(serializedPersons)
    persons shouldBe deserializedPersons