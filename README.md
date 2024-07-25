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
>OpenJDK Runtime Environment Zulu22.30+13-CA (build 22.0.1+8), **Scala 3.5.0-RC5**, **Fury 0.6.0** Apple M1, 2020, 16GB
1. jsoniter - 0.0
2. fury     - 0.0
>Total time: 402 s (06:42), 10 warmups, 10 iterations, average time in microseconds, completed **2024.7.25**

>OpenJDK Runtime Environment Zulu22.28+91-CA (build 22+36), **Scala 3.4.2-RC1**, **Fury 0.5.0** Apple M1, 2020, 16GB
1. jsoniter - 0.187
2. fury     - 0.491
>Total time: 402 s (06:42), 10 warmups, 10 iterations, average time in microseconds, completed **2024.5.8**

Resources
---------
* [Apache Fury](https://fury.apache.org/)
* [Fury Scala Guide](https://github.com/alipay/fury/blob/main/docs/guide/scala_guide.md)
* [Pro Benchmarking Tips](https://github.com/objektwerks/fury/pull/1)
* [Scala3-Json Benchmarks](https://github.com/objektwerks/scala3.json)