name := "$name;format="lower,hyphen"$"

version := "$app_version$"

scalaVersion := "$scala_version$"

lazy val scalatestVersion = "$scalatest_version$"
lazy val scalaLoggingVersion = "$scala_logging_version$"
lazy val logbackClassicVersion= "$logback_classic_version$"
lazy val catsCoreVersion= "$cats_core_version$"

scalacOptions ++= Seq(
  "-encoding", "UTF-8",   // source files are in UTF-8
  "-deprecation",         // warn about use of deprecated APIs
  "-unchecked",           // warn about unchecked type parameters
  "-feature",             // warn about misused language features
  "-language:higherKinds",// allow higher kinded types without `import scala.language.higherKinds`
  "-Xlint",               // enable handy linter warnings
  "-Xfatal-warnings",     // turn compiler warnings into errors
  "-Ypartial-unification",// allow the compiler to unify type constructors of different arities
  "-target:jvm-1.8"
)

libraryDependencies ++= Seq(
  "org.typelevel" %% "cats-core" % catsCoreVersion,
  "com.typesafe.scala-logging" %% "scala-logging" % scalaLoggingVersion,
  "ch.qos.logback" % "logback-classic" % logbackClassicVersion,
  "org.scalatest" %% "scalatest" % scalatestVersion % "test"
)