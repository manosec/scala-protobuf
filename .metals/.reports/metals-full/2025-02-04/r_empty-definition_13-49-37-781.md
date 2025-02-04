error id: 
file://<WORKSPACE>/build.sbt
empty definition using pc, found symbol in pc: 
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

libraryDependencies ++= Seq(
  "com.thesamet.scalapb" %% "scalapb-runtime" % scalapbVersion % "protobuf",
  "com.thesamet.scalapb" %% "scalapb-runtime-grpc" % scalapbVersion
)


// In project/plugins.sbt, add:
addSbtPlugin("com.thesamet" % "sbt-protoc" % "1.0.4")

// In build.sbt, include:
libraryDependencies += "com.thesamet.scalapb" %% "scalapb-runtime" % "0.11.10" // check for the latest version

// Enable the ScalaPB code generation:
ThisBuild / PB.targets := Seq(
  scalapb.gen() -> (sourceManaged in Compile).value / "scalapb"
)

```

#### Short summary: 

empty definition using pc, found symbol in pc: 