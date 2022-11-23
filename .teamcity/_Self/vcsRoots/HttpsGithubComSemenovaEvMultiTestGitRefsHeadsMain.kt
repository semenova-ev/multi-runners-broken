package _Self.vcsRoots

import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.vcs.GitVcsRoot

object HttpsGithubComSemenovaEvMultiTestGitRefsHeadsMain : GitVcsRoot({
    name = "https://github.com/semenova-ev/multi-test.git#refs/heads/main"
    url = "https://github.com/semenova-ev/multi-test.git"
    branch = "refs/heads/main"
    branchSpec = "refs/heads/*"
})
