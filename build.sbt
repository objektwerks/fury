enablePlugins(JmhPlugin)

name := "fury"
organization := "objektwerks"
version := "0.2-SNAPSHOT"
scalaVersion := "3.7.2"
libraryDependencies ++= {
  val jsoniterVersion = "2.37.0"
  Seq(
    "org.apache.fury" % "fury-core" % "0.10.3",
    "com.github.plokhotnyuk.jsoniter-scala" %% "jsoniter-scala-core" % jsoniterVersion,
    "com.github.plokhotnyuk.jsoniter-scala" %% "jsoniter-scala-macros" % jsoniterVersion % Provided,
    "ch.qos.logback" % "logback-classic" % "1.5.18" % Test,
    "org.scalatest" %% "scalatest" % "3.2.19" % Test
  )
}
parallelExecution := false
scalacOptions ++= Seq(
  "-Wunused:all"
)
