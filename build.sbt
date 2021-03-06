
name := "scalajs-ionic"

val commonSettings = Seq(
  organization := "angulate",
  version := "0.1-SNAPSHOT",
  scalaVersion := "2.11.5",
  scalacOptions ++= Seq("-deprecation","-feature","-Xlint"),
  resolvers += "karchedon-repo" at "http://maven.karchedon.de/"
)

val angulateDebugFlags = Seq(
  "runtimeLogging",
  "ModuleMacros.debug",
  "ControllerMacros.debug"
  //"DirectiveMacros.debug"
  //"ServiceMacros.debug"
  //"HttpPromiseMacros.debug"
).map( f => s"-Xmacro-settings:biz.enef.angular.$f" )

lazy val root = project.in(file(".")).
  enablePlugins(ScalaJSPlugin).
  settings(commonSettings: _*).
  //settings(publishingSettings: _*).
  //settings(sonatypeSettings: _*).
  settings(
    name := "scalajs-ionic",
    normalizedName := "scalajs-ionic",
    scalacOptions ++= angulateDebugFlags,
    libraryDependencies ++= Seq(
      "biz.enef" %%% "scalajs-angulate" % "0.2-SNAPSHOT",
      "angulate" %%% "scalajs-angulate-uirouter" % "0.1-SNAPSHOT"
    )
  )

lazy val tests = project.
  dependsOn(root).
  enablePlugins(ScalaJSPlugin).
  settings(commonSettings: _*).
  settings(
    publish := {},
    publishLocal := {},
    scalacOptions ++= angulateDebugFlags,
    scalaJSStage := FastOptStage,
    //jsEnv in Test := PhantomJSEnv("phantomjs" , Seq("--remote-debugger-port=9000","--remote-debugger-autorun=true")).value,
    //jsEnv in Test := PhantomJSEnv("phantomjs" , Seq("--debug=true")).value,
    jsEnv in Test := PhantomJSEnv().value,
    testFrameworks += new TestFramework("utest.runner.Framework"),
    libraryDependencies += "com.lihaoyi" %%% "utest" % "0.3.0" % "test",
    jsDependencies += RuntimeDOM,
    jsDependencies += "org.webjars" % "ionic" % "1.0.0-beta.14" / "ionic.bundle.min.js" % "test"
  )
