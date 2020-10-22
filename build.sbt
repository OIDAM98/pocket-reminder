import Dependencies._

ThisBuild / scalaVersion     := "2.13.3"
ThisBuild / version          := "0.1.0-SNAPSHOT"
ThisBuild / organization     := "com.odealva"
ThisBuild / organizationName := "odealva"

val CirceVersion         = "0.13.0"

lazy val core = (project in file("core"))
  .settings(
    name := "testy",
    libraryDependencies ++= Seq(
    	"io.circe"          %% "circe-core"          % CirceVersion,
    	"io.circe"          %% "circe-generic"       % CirceVersion,
    	"io.circe"          %% "circe-parser"        % CirceVersion,
    	"org.typelevel" %% "cats-core" % "2.2.0",
    	"org.typelevel" %% "cats-effect" % "2.2.0",
    	"com.softwaremill.sttp.client" %% "core" % "2.2.9",
    	"com.softwaremill.sttp.client" %% "circe" % "2.2.9",
    	"com.softwaremill.sttp.client" %% "cats" % "2.2.9",
    	"com.softwaremill.sttp.client" %% "async-http-client-backend-cats" % "2.2.9"
    )
    libraryDependencies += scalaTest % Test
  )

// See https://www.scala-sbt.org/1.x/docs/Using-Sonatype.html for instructions on how to publish to Sonatype.