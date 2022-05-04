name := """beverly-inventario"""
organization := "com.spabeverly"
version := "1.0-SNAPSHOT"
scalaVersion := "2.13.6"
libraryDependencies += guice
libraryDependencies += "commons-beanutils" % "commons-beanutils" % "1.9.3"
libraryDependencies += "software.amazon.awssdk" % "sdk-core" % "2.17.90"
libraryDependencies += "software.amazon.awssdk" % "dynamodb" % "2.17.90"
libraryDependencies += "software.amazon.awssdk" % "sqs" % "2.17.99"
libraryDependencies += "software.amazon.awssdk" % "sns" % "2.17.99"
libraryDependencies += "software.amazon.awssdk" % "bom" % "2.17.90" % "runtime" pomOnly()

lazy val root = (project in file(".")).enablePlugins(PlayJava)