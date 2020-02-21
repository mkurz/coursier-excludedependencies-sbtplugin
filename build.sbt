lazy val root = (project in file("."))
  .enablePlugins(PlayWeb)
  .disablePlugins(PlayLayoutPlugin)
  .settings(
    name := "coursier-excludeDependencies-sbtPlugin",
    version := "1.0-SNAPSHOT",
    scalaVersion := "2.13.1",
    excludeDependencies ++= Seq(
      "com.typesafe.play" %% "play-akka-http-server"
      // or:
      //ExclusionRule("com.typesafe.play", "play-akka-http-server_2.13")
    )
  )

// Disable coursier to make excludeDependencies work
//ThisBuild / useCoursier := false
