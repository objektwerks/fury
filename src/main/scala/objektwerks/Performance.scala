package objektwerks

import java.util.concurrent.TimeUnit

import org.openjdk.jmh.annotations.*

@State(Scope.Thread)
@BenchmarkMode(Array(Mode.AverageTime))
@OutputTimeUnit(TimeUnit.MICROSECONDS)
@Warmup(iterations = 10)
@Measurement(iterations = 10)
@Fork(1)
class Performance:
  val person = Person.newPerson

  @Benchmark
  def fury(): Person = Store.deserialize( Store.serialize(person) )

  @Benchmark
  def jsoniter(): (String, Person) =
    val serializedPerson = Store.toJson(person)
    val deserializedPerson = Store.fromJson(serializedPerson)
    (serializedPerson, deserializedPerson)