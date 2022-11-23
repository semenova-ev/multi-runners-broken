package _Self.buildTypes

import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.buildSteps.python

object Python : BuildType({
    name = "Python"

    steps {
        python {
            command = file {
                filename = "file.py"
            }
        }
    }
})
