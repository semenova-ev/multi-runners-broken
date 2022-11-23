package _Self.buildTypes

import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.buildFeatures.perfmon
import jetbrains.buildServer.configs.kotlin.v2019_2.buildSteps.gradle
import jetbrains.buildServer.configs.kotlin.v2019_2.triggers.vcs

object Gradle : BuildType({
    name = "Gradle"

    vcs {
        root(_Self.vcsRoots.HttpsGithubComSemenovaEvGradleGitRefsHeadsMaster)
    }

    steps {
        gradle {
            tasks = "clean build"
            gradleWrapperPath = ""
        }
    }

    triggers {
        vcs {
        }
    }

    features {
        perfmon {
        }
    }
})
