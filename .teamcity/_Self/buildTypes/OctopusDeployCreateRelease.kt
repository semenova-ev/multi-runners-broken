package _Self.buildTypes

import jetbrains.buildServer.configs.kotlin.v2019_2.*

object OctopusDeployCreateRelease : BuildType({
    name = "OctopusDeploy_CreateRelease"

    steps {
        step {
            type = "octopus.create.release"
            param("octopus_version", "3.0+")
            param("octopus_host", "localhost:8080")
            param("octopus_project_name", "project")
            param("secure:octopus_apikey", "cks3a8285037469ac8a3da9fb982ab002f18910eZbDCmzduttEcDZ921inn7MWzxVMDuQSU4KEwzEJihVClorfFDKjxdvE2rZoGM1Uz3tZ7TXAKlGUHuMr7g==")
        }
    }
})
