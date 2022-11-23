package _Self.buildTypes

import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.buildSteps.dotnetBuild

object DotNET : BuildType({
    name = "dotNET"

    steps {
        dotnetBuild {
            param("dotNetCoverage.dotCover.home.path", "%teamcity.tool.JetBrains.dotCover.CommandLineTools.DEFAULT%")
        }
    }
})
