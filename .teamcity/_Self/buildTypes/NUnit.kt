package _Self.buildTypes

import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.buildSteps.nunit

object NUnit : BuildType({
    name = "NUnit"

    steps {
        nunit {
            nunitPath = "nunit.exe"
            includeTests = "dir"
        }
    }
})
