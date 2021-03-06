name := """my-scala-all"""

version := "1.0"

scalaVersion := "2.10.5"

scalacOptions in (Compile, doc) ++= Seq("-doc-root-content", baseDirectory.value+"/root-doc.txt")

libraryDependencies += "org.scalacheck" % "scalacheck_2.10" % "1.13.0"
libraryDependencies += "org.scalaz" %% "scalaz-core" % "7.1.1"
resolvers += "Scalaz Bintray Repo" at "http://dl.bintray.com/scalaz/releases"


