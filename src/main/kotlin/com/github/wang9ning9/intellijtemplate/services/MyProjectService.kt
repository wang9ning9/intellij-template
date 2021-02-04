package com.github.wang9ning9.intellijtemplate.services

import com.github.wang9ning9.intellijtemplate.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
