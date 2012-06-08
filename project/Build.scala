import sbt._
import Keys._
import PlayProject._

object ApplicationBuild extends Build {

    val appName         = "happytrails"
    val appVersion      = "1.0-SNAPSHOT"

    val appDependencies = Seq(
      "com.github.twitter" % "bootstrap" % "2.0.3",
      "rome" % "rome" % "1.0",
      "play" %% "console" % "2.0.1"
    )

    val main = PlayProject(appName, appVersion, appDependencies, mainLang = JAVA).settings(
      resolvers += "webjars" at "http://webjars.github.com/m2"
    )

}