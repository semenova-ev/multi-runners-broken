package _Self

import _Self.buildTypes.*
import _Self.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({

    vcsRoot(HttpsGithubComSemenovaEvMultiTestGitRefsHeadsMain)
    vcsRoot(HttpsGithubComSemenovaEvBuildActionsProjectGitRefsHeadsMaster)
    vcsRoot(HttpsGithubComSemenovaEvGradleGitRefsHeadsMaster)
    vcsRoot(HttpsGithubComSemenovaEvMavenRunnerGitRefsHeadsMaster)

    buildType(OctopusDeployPushPackages)
    buildType(Python)
    buildType(DotNET)
    buildType(NuGetPack)
    buildType(OctopusDeployCreateRelease)
    buildType(NodeJS)
    buildType(NUnit)
    buildType(Gradle)
    buildType(Cmd)
    buildType(Docker)
    buildType(DockerCompose)
    buildType(PowerShell)
    buildType(OctopusDeployPack)
    buildType(NuGetInstaller)
    buildType(Maven)
    buildType(Unity)
})
