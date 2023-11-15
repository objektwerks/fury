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
  @Benchmark
  def fury(): Person = Store.deserialize( Store.serialize( Person.newPerson ) )

  @Benchmark
  def jsoniter(): Person = Store.fromJson( Store.toJson( Person.newPerson ) )