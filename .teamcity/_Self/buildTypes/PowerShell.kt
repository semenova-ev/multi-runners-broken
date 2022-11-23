package _Self.buildTypes

import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.buildSteps.powerShell

object PowerShell : BuildType({
    name = "PowerShell"

    steps {
        powerShell {
            scriptMode = script {
                content = """
                    Write-Host 'Hello, World!'
                    ${'$'}env:TEST = ';TESTS'
                """.trimIndent()
            }
            param("jetbrains_powershell_script_file", "script.ps1")
        }
    }
})
