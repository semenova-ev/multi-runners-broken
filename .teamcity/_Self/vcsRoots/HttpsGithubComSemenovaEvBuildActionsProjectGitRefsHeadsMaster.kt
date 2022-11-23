package _Self.vcsRoots

import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.vcs.GitVcsRoot

object HttpsGithubComSemenovaEvBuildActionsProjectGitRefsHeadsMaster : GitVcsRoot({
    name = "https://github.com/semenova-ev/BuildActionsProject.git#refs/heads/master"
    url = "https://github.com/semenova-ev/BuildActionsProject.git"
    branch = "refs/heads/master"
    branchSpec = "refs/heads/*"
})
