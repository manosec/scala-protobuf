error id: scala/Predef.`???`().
file://<WORKSPACE>/build.sbt
empty definition using pc, found symbol in pc: scala/Predef.`???`().
empty definition using semanticdb
|empty definition using fallback
non-local guesses:
	 -

Document text:

```scala
ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.12.10"

lazy val root = (project in file("."))
  .settings(
    name := "protobuf-scala"
  )


val scalapbVersion = "0.11.15"

val libraryDependencies ++= {
  "com.thesamet.scalapb" %% "scalapb-runtime" % scalapbVersion % "protobuf",
  "com.thesamet.scalapb" %% "scalapb-runtime-grpc" % scalapbVersion
}

```

#### Short summary: 

empty definition using pc, found symbol in pc: scala/Predef.`???`().