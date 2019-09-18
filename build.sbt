import Dependencies._

ThisBuild / scalaVersion     := "2.12.0"
ThisBuild / version          := "0.0.0"
ThisBuild / organization     := "com.higherkinded"
ThisBuild / organizationName := "higherkinded"
ThisBuild / mainClass        := Some("main.Main")

lazy val root = (project in file("."))
  .settings(
    name := "roguelike",
    libraryDependencies += scalaTest % Test,
    libraryDependencies += ScalaZ,
    libraryDependencies += ZIO
  )
