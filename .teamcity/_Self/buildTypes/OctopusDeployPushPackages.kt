package _Self.buildTypes

import jetbrains.buildServer.configs.kotlin.*

object OctopusDeployPushPackages : BuildType({
    name = "OctopusDeploy_PushPackages"

    steps {
        step {
            type = "octopus.push.package"
            param("octopus_host", "localhost:8080")
            param("octopus_packagepaths", "published-webapp/**/* => MyApp.%build.number%.zip")
            param("octopus_forcepush", "false")
            param("secure:octopus_apikey", "cks3a8285037469ac8a3da9fb982ab002f18910eZbDCmzduttEcDZ921inn7MWzxVMDuQSU4KEwzEJihVClorfFDKjxdvE2rZoGM1Uz3tZ7TXAKlGUHuMr7g==")
        }
    }
})
