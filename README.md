Fury
----
>Fury feature tests and benchmarks using Jsoniter and Scala 3.

Build
-----
1. sbt clean compile

Test
----
1. sbt clean test

Benchmark
---------
>See objektwerks.Performance class for details.
1. sbt jmh:run

Results
-------
>OpenJDK Runtime Environment Zulu21.28+85-CA (build 21+35), **Scala 3.3.1**, Apple M1, 2020, 16GB
1. jsoniterBenchmark 0.243
2. furyBenchmark     0.470
>Total time: 402 s (06:42), 10 warmups, 10 iterations, in microseconds, completed **2023.11.10**


Resources
---------
* [Fury Scala Guide](https://github.com/alipay/fury/blob/main/docs/guide/scala_guide.md)