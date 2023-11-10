package objektwerks

import com.github.plokhotnyuk.jsoniter_scala.core.*

import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

import Person.given

final class JsoniterTest extends AnyFunSuite with Matchers:
  test("person"):  
    val person = Person.newPerson
    val personJson = Store.toJson(person)
    person shouldBe Store.fromJson(personJson)