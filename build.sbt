name := "AkkaGame"

version := "1.0"

scalaVersion := "2.11.7"

crossPaths := false

unmanagedSourceDirectories in Compile := (scalaSource in Compile).value :: Nil

unmanagedSourceDirectories in Test := (scalaSource in Test).value :: Nil


libraryDependencies ++= {
  val scalaTestVersion  = "2.2.4"
  Seq(
     "org.scalatest"     %% "scalatest"       % scalaTestVersion  % "test"
  )
}