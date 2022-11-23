package _Self.buildTypes

import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.buildFeatures.perfmon
import jetbrains.buildServer.configs.kotlin.v2019_2.buildSteps.maven
import jetbrains.buildServer.configs.kotlin.v2019_2.triggers.vcs

object Maven : BuildType({
    name = "Maven"

    vcs {
        root(_Self.vcsRoots.HttpsGithubComSemenovaEvMavenRunnerGitRefsHeadsMaster)
    }

    steps {
        maven {
            goals = "clean test"
            pomLocation = "ch-simple/pom.xml"
            runnerArgs = "-Dmaven.test.failure.ignore=true"
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
