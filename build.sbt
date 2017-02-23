import play.sbt.PlayJava

name := """play-java-intro"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
  // If you enable PlayEbean plugin you must remove these
  // JPA dependencies to avoid conflicts.
  javaJpa,
  "org.hibernate" % "hibernate-entitymanager" % "4.3.7.Final"
)

// RETO: siehe https://github.com/sbt/sbt/issues/2054
// Removing the project/sbt-ui.sbt file and the fork in run := true entry from the build.sbt file fixed the problem for me
// Besser: http://stackoverflow.com/questions/33323623/error-deploying-play-framework-2-4-on-heroku
//resolvers += Resolver.url("Typesafe Ivy releases", url("https://repo.typesafe.com/typesafe/ivy-releases"))(Resolver.ivyStylePatterns)
//fork in run := true
