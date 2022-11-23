package _Self.vcsRoots

import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.vcs.GitVcsRoot

object HttpsGithubComSemenovaEvMavenRunnerGitRefsHeadsMaster : GitVcsRoot({
    name = "https://github.com/semenova-ev/MavenRunner.git#refs/heads/master"
    url = "https://github.com/semenova-ev/MavenRunner.git"
    branch = "refs/heads/master"
    branchSpec = "refs/heads/*"
})
