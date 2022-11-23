package _Self.buildTypes

import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.buildSteps.nodeJS

object NodeJS : BuildType({
    name = "NodeJS"

    steps {
        nodeJS {
            shellScript = """
                npm ci
                npm run test
            """.trimIndent()
        }
    }
})
