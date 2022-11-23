package _Self.buildTypes

import jetbrains.buildServer.configs.kotlin.v2019_2.*

object Unity : BuildType({
    name = "Unity"

    steps {
        step {
            type = "unity"
        }
    }
})
