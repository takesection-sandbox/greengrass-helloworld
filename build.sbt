lazy val root = (project in file(".")).
  settings(
    name := "greengrass-helloworld",
    version := "0.1.0-SNAPSHOT",
    scalaVersion := "2.12.3",
    libraryDependencies ++= Seq(
        "com.amazonaws" % "aws-lambda-java-core" % "1.1.0",
        "com.amazonaws" % "aws-java-sdk-greengrass" % "1.11.207"
    )
  )
