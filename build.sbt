enablePlugins(JmhPlugin)

name := "fury"
organization := "objektwerks"
version := "0.1-SNAPSHOT"
scalaVersion := "3.5.0-RC1"
libraryDependencies ++= {
  val jsoniterVersion = "2.28.5"
  Seq(
    "org.apache.fury" % "fury-core" % "0.5.0",
    "com.github.plokhotnyuk.jsoniter-scala" %% "jsoniter-scala-core" % jsoniterVersion,
    "com.github.plokhotnyuk.jsoniter-scala" %% "jsoniter-scala-macros" % jsoniterVersion % Provided,
    "ch.qos.logback" % "logback-classic" % "1.5.6" % Test,
    "org.scalatest" %% "scalatest" % "3.2.18" % Test
  )
}
parallelExecution := false
scalacOptions ++= Seq(
  "-Wunused:all"
)
