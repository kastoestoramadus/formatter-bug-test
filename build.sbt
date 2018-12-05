import Dependencies._

lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "com.example",
      scalaVersion := "2.11.12",
      version      := "0.1.0-SNAPSHOT"
    )),
    name := "formatter-bug-test",
    libraryDependencies ++= Seq(
      scalaTest % Test,
      "org.scalatest" %% "scalatest" % "2.2.6",
      "com.typesafe.play" %% "play-json" % "2.5.16",
      "org.reactivemongo" %% "play2-reactivemongo" % "0.16.0-play25"
      //"uk.gov.hmrc" %% "play-reactivemongo" % "6.2.0" // 0.12.6-play25

    )
  )
