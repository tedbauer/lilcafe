enablePlugins(ScalaJSPlugin)

name := "Lil cafe"
scalaVersion := "2.13.1"

scalaJSUseMainModuleInitializer := true
scalafmtOnCompile := true

libraryDependencies += "org.scala-js" %%% "scalajs-dom" % "2.1.0"