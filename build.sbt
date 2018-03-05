name         := "sbt-atom-package"
organization := "laughedelic"
description  := "sbt plugin for making Atom packages in Scala.js"

sbtPlugin := true

homepage := Some(url(s"https://github.com/laughedelic/${name.value}"))
scmInfo in ThisBuild := Some(ScmInfo(
  homepage.value.get,
  s"scm:git:git@github.com:laughedelic/${name.value}.git"
))

licenses := Seq("GPL-V3" -> url("http://www.gnu.org/licenses/gpl-3.0.txt"))
developers := List(Developer(
  "laughedelic",
  "Alexey Alekhin",
  "laughedelic@gmail.com",
  url("https://github.com/laughedelic")
))

scalaVersion := "2.12.4"
scalacOptions ++= Seq(
  "-unchecked",
  "-deprecation",
  "-Ywarn-unused-import"
)


libraryDependencies ++= Seq()

releaseEarlyWith := BintrayPublisher
releaseEarlyEnableSyncToMaven := false
releaseEarlyNoGpg := true

publishMavenStyle := true
bintrayReleaseOnPublish := !isSnapshot.value

libraryDependencies += "com.typesafe.play" %% "play-json" % "2.6.7"
addSbtPlugin("org.scala-js" % "sbt-scalajs" % "0.6.22")
addSbtPlugin("com.dwijnand" % "sbt-dynver" % "2.1.0")
