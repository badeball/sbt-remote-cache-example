ThisBuild / pushRemoteCacheTo := Some(MavenCache("local-cache", file("/tmp/remote-cache")))

publishLocalConfiguration ~= (_.withOverwrite(true))

name := "foo"

ThisBuild / organization := "com.bar"
ThisBuild / version := "dev"

lazy val root = ((project in file("."))
  .settings(name := "foobar"))
  .aggregate(
    global,
    backend,
  )

lazy val global = project

lazy val backend =
  project.dependsOn(
    global
  )
