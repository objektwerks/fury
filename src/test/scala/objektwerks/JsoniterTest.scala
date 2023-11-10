package objektwerks

import com.github.plokhotnyuk.jsoniter_scala.core.*

import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

import Person.given

final class JsoniterTest extends AnyFunSuite with Matchers:
  test("case class"):  
    val person = Person.newPerson
    val personJson = Store.toJson(person)
    person shouldBe Store.fromJson(personJson)

  test("list of case classes"):
    val persons = Person.newPersons
    val personsJson = Store.toJson(persons)
    persons shouldBe Store.fromJson(personsJson)