package _Self.buildTypes

import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.buildSteps.nuGetInstaller

object NuGetInstaller : BuildType({
    name = "NuGet_Installer"

    steps {
        nuGetInstaller {
            toolPath = "NuGet.exe"
            projects = "path.sln"
            updatePackages = updateParams {
            }
        }
    }
})
