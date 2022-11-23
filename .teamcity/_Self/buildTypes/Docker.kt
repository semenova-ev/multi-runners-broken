package _Self.buildTypes

import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.buildSteps.dockerCommand

object Docker : BuildType({
    name = "Docker"

    steps {
        dockerCommand {
            commandType = build {
                source = file {
                    path = "docker.file"
                }
                commandArgs = "--pull"
            }
        }
    }
})
