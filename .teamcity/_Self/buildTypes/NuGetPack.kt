package _Self.buildTypes

import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.buildSteps.nuGetPack

object NuGetPack : BuildType({
    name = "NuGet_Pack"

    steps {
        nuGetPack {
            toolPath = "NuGet.exe"
            paths = "file.nuspec"
            outputDir = "dir"
            cleanOutputDir = false
        }
    }
})
