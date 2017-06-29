name := """playLearn"""
organization := "com.learn"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.12.2"

libraryDependencies += guice
libraryDependencies += "org.scalatestplus.play" %% "scalatestplus-play" % "3.0.0" % Test
libraryDependencies +=  "mysql" % "mysql-connector-java" % "5.1.18"
//libraryDependencies += jdbc

// 支持play-slick 和 此 的数据访问
libraryDependencies ++= Seq(
	"com.typesafe.play" %% "play-slick" % "3.0.0",
	"com.typesafe.play" %% "play-slick-evolutions" % "3.0.0"
)
/*libraryDependencies ++= Seq(
    javaJdbc,
    javaEbean,
    "mysql" % "mysql-connector-java" % "5.1.18"
)*/
// Adds additional packages into Twirl
//TwirlKeys.templateImports += "com.example.controllers._"

// Adds additional packages into conf/routes
// play.sbt.routes.RoutesKeys.routesImport += "com.example.binders._"
