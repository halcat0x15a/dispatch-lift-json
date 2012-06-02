scalaVersion := "2.9.2"

resolvers += "Typesafe Snapshots" at "http://repo.typesafe.com/typesafe/snapshots/"

libraryDependencies ++= Seq(
  "net.databinder" %% "dispatch-core" % "0.8.+",
  "net.liftweb" %% "lift-json" % "2.+",
  "net.databinder" %% "dispatch-http" % "0.8.+" % "test",
  "org.scala-tools.testing" %% "specs" % "1.6.9" % "test"
)
