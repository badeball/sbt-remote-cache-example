import sbt._

object Dependencies {
  val doobieVersion = "0.10.0"

  lazy val doobie =
    Seq(
      "org.tpolecat" %% "doobie-hikari"    % doobieVersion,
      "org.tpolecat" %% "doobie-core"      % doobieVersion,
      "org.tpolecat" %% "doobie-scalatest" % doobieVersion % "test"
    )
}
