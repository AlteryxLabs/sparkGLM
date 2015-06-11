scalaVersion := "2.10.4"

sparkVersion := "1.4.0"

spName := "Alteryx/sparkGLM"

version := "0.0.1"

organization := "com.alteryx"

licenses := Seq("Apache-2.0" -> url("http://opensource.org/licenses/Apache-2.0"))

sparkComponents ++= Seq("sql", "mllib")

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "1.9.1" % "test",
  "org.scalanlp" % "breeze_2.10" % "0.11.2",
  "com.github.fommil.netlib" % "all" % "1.1.2" pomOnly(),
  "edu.berkeley.cs.amplab" % "mlmatrix" % "0.1" from "https://s3-us-west-1.amazonaws.com/amp-ml-matrix/2.10/mlmatrix_2.10-0.1.jar"
)

resolvers ++= Seq(
  "Amplab ml-matrix repo" at "https://s3-us-west-1.amazonaws.com/",
  Resolver.mavenLocal
)

// uncomment and change the value below to change the directory where your zip artifact will be created
// spDistDirectory := target.value