package _Self.buildTypes

import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.buildSteps.dockerCompose

object DockerCompose : BuildType({
    name = "DockerCompose"

    steps {
        dockerCompose {
        }
    }
})
