package objektwerks

enum Gender:
  case Female, Male

final case class Person(id: Int,
                        name: String,
                        age: Int,
                        gender: Gender = Gender.Male,
                        trade: Option[String])