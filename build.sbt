name := """play-bootstrap4-admin"""

version := "0.0.1"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.13.1"

libraryDependencies += "org.scalatestplus.play" %% "scalatestplus-play" % "4.0.3" % Test
libraryDependencies += "com.softwaremill.macwire" %% "macros" % "2.3.3" % "provided"

scalacOptions ++= Seq("-feature", "-deprecation", "-Xfatal-warnings")
