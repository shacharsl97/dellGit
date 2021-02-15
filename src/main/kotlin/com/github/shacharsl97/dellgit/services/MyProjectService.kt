package com.github.shacharsl97.dellgit.services

import com.github.shacharsl97.dellgit.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
