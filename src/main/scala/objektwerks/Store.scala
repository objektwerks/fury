package objektwerks

import com.github.plokhotnyuk.jsoniter_scala.core.*

import io.fury.Fury

object Store:
  val fury = Fury
    .builder
    .withScalaOptimizationEnabled(true)
    .requireClassRegistration(false)
    .withRefTracking(true)
    .build

  def serialize(person: Person): Array[Byte] = fury.serialize(person)

  def serialize(persons: List[Person]): Array[Byte] = fury.serialize(persons)

  def deserialize(bytes: Array[Byte]): Person = fury.deserialize(bytes).asInstanceOf[Person]

  def toJson(person: Person): String = writeToString[Person](person)

  def fromJson(json: String): Person = readFromString[Person](json)