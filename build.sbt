enablePlugins(JmhPlugin)

name := "fury"
organization := "objektwerks"
version := "0.1-SNAPSHOT"
scalaVersion := "3.4.0-RC1"
libraryDependencies ++= {
  val jsoniterVersion = "2.27.1"
  Seq(
    "org.furyio" % "fury-core" % "0.4.1",
    "com.github.plokhotnyuk.jsoniter-scala" %% "jsoniter-scala-core" % jsoniterVersion,
    "com.github.plokhotnyuk.jsoniter-scala" %% "jsoniter-scala-macros" % jsoniterVersion % Provided,
    "ch.qos.logback" % "logback-classic" % "1.4.14" % Test,
    "org.scalatest" %% "scalatest" % "3.2.17" % Test
  )
}
parallelExecution := false
scalacOptions ++= Seq(
  "-Wunused:all"
)
