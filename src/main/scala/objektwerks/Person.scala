package objektwerks

import com.github.plokhotnyuk.jsoniter_scala.core.*
import com.github.plokhotnyuk.jsoniter_scala.macros.*
import scala.util.Random

enum Gender:
  case Female, Male

final case class Person(id: Int,
                        name: String,
                        age: Int,
                        gender: Gender = Gender.Male,
                        trade: Option[String])

object Person:
  given JsonValueCodec[Person] = JsonCodecMaker.make[Person]
  given JsonValueCodec[List[Person]] = JsonCodecMaker.make[List[Person]]

  def newPerson: Person = Person(
    id = Random.between(1, 1_000_000),
    name = "Fred Flintstone",
    age = Random.between(1, 1_000_000),
    trade = Some("stone mover")
  )

  val persons = List( newPerson, newPerson )