package com.sun.sunplugin

import com.android.build.api.transform.QualifiedContent
import com.android.build.api.transform.Transform

/**
 * @author hengyangji
 * on 2022/9/19
 */
class SunTransform : Transform() {
    override fun getName(): String {
        TODO("Not yet implemented")
    }

    override fun getInputTypes(): MutableSet<QualifiedContent.ContentType> {
        TODO("Not yet implemented")
    }

    override fun getScopes(): MutableSet<in QualifiedContent.Scope> {
        TODO("Not yet implemented")
    }

    override fun isIncremental(): Boolean {
        TODO("Not yet implemented")
    }
}