ThisBuild / scalaVersion := "3.2.1"
ThisBuild / nativeMode := "debug"


// https://mvnrepository.com/artifact/dev.zio/zio
ThisBuild / libraryDependencies += "dev.zio" %% "zio" % "2.0.6"


enablePlugins(ScalaNativePlugin)
