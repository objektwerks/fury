name := "fury"
organization := "objektwerks"
version := "0.1-SNAPSHOT"
scalaVersion := "3.3.1"
libraryDependencies ++= {
  Seq(
    "org.furyio" % "fury-core" % "0.3.0" % Test,
    "ch.qos.logback" % "logback-classic" % "1.4.11" % Test,
    "org.scalatest" %% "scalatest" % "3.2.17" % Test
  )
}
scalacOptions ++= Seq(
  "-Wunused:all"
)