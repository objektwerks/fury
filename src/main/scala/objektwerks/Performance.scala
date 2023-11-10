package objektwerks

import java.util.concurrent.TimeUnit

import org.openjdk.jmh.annotations.*

@State(Scope.Thread)
@BenchmarkMode(Array(Mode.AverageTime))
@OutputTimeUnit(TimeUnit.MICROSECONDS)
@Warmup(iterations = 10)
@Measurement(iterations = 100)
@Fork(1)
class Performance:
  @Benchmark
  def jsoniterBenchmark(): Unit =
    val person = Person.newPerson
    val personJson = Store.toJson(person)
    assert( person == Store.fromJson(personJson) )

  @Benchmark
  def furyBenchmark(): Unit =
    val person = Person.newPerson
    val serializedPerson = Store.serialize(person)
    val deserializedPerson = Store.deserialize(serializedPerson)
    assert( person == deserializedPerson )