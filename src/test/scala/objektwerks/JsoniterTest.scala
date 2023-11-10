package objektwerks

import com.github.plokhotnyuk.jsoniter_scala.core.*

import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

import Person.given

final class JsoniterTest extends AnyFunSuite with Matchers:
  test("case class"):  
    val person = Person(id = 1, name = "Fred Flintstone", age = 24, trade = Some("stone mover"))
    val personJson = writeToString[Person](person)
    person shouldBe readFromString[Person](personJson)