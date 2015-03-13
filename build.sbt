name := "Scatic"

version := "1.0"

scalaVersion := "2.11.6"

resolvers += "Sonatype OSS Snapshots" at "https://oss.sonatype.org/content/groups/public/"

libraryDependencies +=
  "org.scalatra.scalate" %% "scalate-core" % "1.7.0"

libraryDependencies +=
  "org.yaml" % "snakeyaml" % "1.16-SNAPSHOT"

// Read here for optional jars and dependencies
libraryDependencies ++= Seq("org.specs2" %% "specs2-core" % "3.0.1" % "test")

resolvers += "scalaz-bintray" at "http://dl.bintray.com/scalaz/releases"

scalacOptions in Test ++= Seq("-Yrangepos")

mainClass := Some("net.yingzxu.scatic.Main")