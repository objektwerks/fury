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
  def jsoniterBenchmark(): Unit =
    import com.github.plokhotnyuk.jsoniter_scala.core.*
    import JsoniterCodecs.given

    val employee = Employees.newEmployee
    val employeeJson = writeToString[Employee](employee)
    assert( employee == readFromString[Employee](employeeJson) )