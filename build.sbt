lazy val pureconfigVersion = "0.13.0"
lazy val typesafeConfigVersion = "1.4.0"

lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization    := "idea.test",
      scalaVersion    := "2.13.3"
    )),
    name := "idea-pureconfig",
    libraryDependencies ++= Seq(
      "com.github.pureconfig" %% "pureconfig" % pureconfigVersion,
      "com.typesafe" % "config" % typesafeConfigVersion
    )
  )
