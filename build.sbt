import sbt.Keys._

name := "market-place"

version := "1.0"

scalaVersion := "2.11.1"

resolvers += "Sonatype Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots/"

resolvers += "java-net" at "http://download.java.net/maven/2"

resolvers += "maven-repo" at "https://github.com/Redmart/maven-repo/raw/master/"

resolvers += "Typesafe repository" at "http://repo.typesafe.com/typesafe/releases/"

libraryDependencies ++= Seq(
  javaEbean,
  cache,
  javaWs,
  "org.mindrot" % "jbcrypt" % "0.3m",
  "com.typesafe" %% "play-plugins-mailer" % "2.2.0",
  filters,
  "com.google.code.gson" % "gson" % "2.2.4",
  "redis.clients" % "jedis" % "2.0.0" exclude("org.slf4j", "slf4j-log4j12"),
  "commons-pool" % "commons-pool" % "1.5.5" exclude("org.slf4j", "slf4j-log4j12"),
  "net.vz.mongodb.jackson" % "play-mongo-jackson-mapper_2.10" % "1.1.0"
)

resolvers ++= Seq(
    "Apache" at "http://repo1.maven.org/maven2/",
    "jBCrypt Repository" at "http://repo1.maven.org/maven2/org/",
    "Sonatype OSS Snasphots" at "http://oss.sonatype.org/content/repositories/snapshots"
)


lazy val root = (project in file(".")).enablePlugins(play.PlayJava)
