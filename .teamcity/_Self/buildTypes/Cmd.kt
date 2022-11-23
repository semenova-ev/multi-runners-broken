package _Self.buildTypes

import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.buildSteps.script

object Cmd : BuildType({
    name = "Cmd"

    steps {
        script {
            scriptContent = "sleep 1"
        }
    }
})
