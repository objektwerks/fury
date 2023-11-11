package objektwerks

import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

final class FuryTest extends AnyFunSuite with Matchers:
  test("person"):
    val person = Person.newPerson
    val serializedPerson = Store.serialize(person)
    val deserializedPerson = Store.deserialize(serializedPerson)
    person shouldBe deserializedPerson

  test("persons"):
    val persons = List( Person.newPerson, Person.newPerson )
    val serializedPersons = Store.serialize(persons)
    val deserializedPersons = Store.deserialize(serializedPersons)
    persons shouldBe deserializedPersons