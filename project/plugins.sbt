//resolvers += "Sonatype snapshots" at "http://oss.sonatype.org/content/repositories/snapshots/"

resolvers += Resolver.url("bintray-sbt-plugin-releases", url("http://dl.bintray.com/content/sbt/sbt-plugin-releases"))(Resolver.ivyStylePatterns)
addSbtPlugin("org.foundweekends" % "sbt-bintray" % "0.4.0")

addSbtPlugin("com.github.mpeltonen" % "sbt-idea" % "1.6.0")
addSbtPlugin("com.typesafe.sbteclipse" % "sbteclipse-plugin" % "4.0.0")

// See https://github.com/orrsella/sbt-sublime
addSbtPlugin("com.orrsella" % "sbt-sublime" % "1.1.1")

// See https://github.com/jrudolph/sbt-dependency-graph
addSbtPlugin("net.virtual-void" % "sbt-dependency-graph" % "0.8.0")

// See https://github.com/rtimush/sbt-updates
addSbtPlugin("com.timushev.sbt" % "sbt-updates" % "0.3.0")
