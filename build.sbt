name := "scrad"

version := "0.1"

scalaVersion := "3.1.1"

idePackagePrefix := Some("org.vermell.scrad")

// https://mvnrepository.com/artifact/org.specs2/specs2-core
libraryDependencies += "org.specs2" %% "specs2-core" % "5.0.0" % Test

enablePlugins(JavaAppPackaging)
dockerRepository := Some("ghcr.io/vermell/scrad")