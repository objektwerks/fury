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
    import Store.fury
    val persons = List( Person.newPerson, Person.newPerson )
    val serializedPersons = fury.serialize(persons)
    val deserializedPersons = fury.deserialize(serializedPersons)
    persons shouldBe deserializedPersons