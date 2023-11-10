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
```
Benchmark                      Mode  Cnt  Score    Error  Units
Performance.furyBenchmark      avgt   10  0.470 ±  0.008  us/op
Performance.jsoniterBenchmark  avgt   10  0.243 ±  0.001  us/op
Total time: 402 s (06:42), completed Nov 10, 2023, 5:16:14 PM
```

Resources
---------
* [Fury Scala Guide](https://github.com/alipay/fury/blob/main/docs/guide/scala_guide.md)