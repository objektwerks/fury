Fury
----
>Fury feature tests and performance benchmark against Jsoniter using Scala 3.

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
>OpenJDK Runtime Environment Zulu22.28+91-CA (build 22+36), **Scala 4.2.1-RC1**, Apple M1, 2020, 16GB
1. jsoniter - 0.187
2. fury     - 0.491
>Total time: 402 s (06:42), 10 warmups, 10 iterations, average time in microseconds, completed **2024.5.8**

>OpenJDK Runtime Environment Zulu21.30+15-CA (build 21.0.1+12-LTS), **Scala 3.3.1**, Apple M1, 2020, 16GB
1. jsoniter - 0.232
2. fury     - 0.467
>Total time: 402 s (06:42), 10 warmups, 10 iterations, average time in microseconds, completed **2023.11.22**

>OpenJDK Runtime Environment Zulu21.28+85-CA (build 21+35), **Scala 3.3.1**, **Fury 0.3.1**, Apple M1, 2020, 16GB
1. jsoniter - 0.237
2. fury     - 0.492
>Total time: 402 s (06:42), 10 warmups, 10 iterations, average time in microseconds, completed **2023.11.15**

Resources
---------
* [Apache Fury](https://fury.apache.org/)
* [Fury Scala Guide](https://github.com/alipay/fury/blob/main/docs/guide/scala_guide.md)
* [Pro Benchmarking Tips](https://github.com/objektwerks/fury/pull/1)
* [Scala3-Json Benchmarks](https://github.com/objektwerks/scala3.json)