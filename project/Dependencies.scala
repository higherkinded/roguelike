import sbt._

object Dependencies {
  lazy val scalaTest = "org.scalatest" %% "scalatest" % "3.0.8"
  lazy val ZIO       = "dev.zio" %% "zio" % "1.0.0-RC12-1"
  lazy val ScalaZ    = "org.scalaz" %% "scalaz-core" % "7.2.28"
}
