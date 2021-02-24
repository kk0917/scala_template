// give the user a nice default project!
ThisBuild / organization := "com.example"
ThisBuild / scalaVersion := "2.13.1"

//scalastyleSources in Compile := (unmanagedSourceDirectories in Compile).value

lazy val root = (project in file(".")).
  settings(
    name := "scala-template")
