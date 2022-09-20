package com.sun.sunplugin

import org.gradle.api.Plugin
import org.gradle.api.Project

/**
 * @author hengyangji
 * on 2022/9/11
 */
class SunPlugin : Plugin<Project> {
    override fun apply(target: Project) {
        println("SunPlugin apply")
    }
}