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
1. jsoniter 0.190
2. fury     0.316
>Total time: 402 s (06:42), 10 warmups, 10 iterations, average time in microseconds, completed **2023.11.11**

>[Current Scala3-Json Tests](https://github.com/objektwerks/scala3.json)

>[Pro Benchmarking Tips](https://github.com/objektwerks/fury/pull/1)

Resources
---------
* [Fury Scala Guide](https://github.com/alipay/fury/blob/main/docs/guide/scala_guide.md)