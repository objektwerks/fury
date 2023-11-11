package objektwerks

import com.github.plokhotnyuk.jsoniter_scala.core.*

import io.fury.Fury

object Store:
  private val fury =
    new ThreadLocal[Fury] {
      override def initialValue(): Fury = Fury
        .builder
        .withScalaOptimizationEnabled(true)
        .requireClassRegistration(false)
        .withRefTracking(true)
        .build
    }

  def serialize(person: Person): Array[Byte] = fury.get.serialize(person)

  def deserialize(bytes: Array[Byte]): Person = fury.get.deserialize(bytes).asInstanceOf[Person]

  def toJson(person: Person): Array[Byte] = writeToArray[Person](person)

  def fromJson(json: Array[Byte]): Person = readFromArray[Person](json)