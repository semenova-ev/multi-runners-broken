package _Self.vcsRoots

import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.vcs.GitVcsRoot

object HttpsGithubComSemenovaEvMultiTestGitRefsHeadsMain : GitVcsRoot({
    name = "https://github.com/semenova-ev/multi-test.git#refs/heads/main"
    url = "https://github.com/semenova-ev/multi-test.git"
    branch = "refs/heads/main"
    branchSpec = "refs/heads/*"
})
