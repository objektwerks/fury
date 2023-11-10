package objektwerks

import io.fury.Fury

object Store:
  val fury = Fury
    .builder
    .withScalaOptimizationEnabled(true)
    .requireClassRegistration(false)
    .withRefTracking(true)
    .build

  def serialize(person: Person): Array[Byte] = fury.serialize(person)