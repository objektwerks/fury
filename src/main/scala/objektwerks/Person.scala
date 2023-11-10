package objektwerks

import com.github.plokhotnyuk.jsoniter_scala.core.*
import com.github.plokhotnyuk.jsoniter_scala.macros.*

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