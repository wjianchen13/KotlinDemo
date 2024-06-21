package com.example.kotlin.mvc.kotlin.base.module

import androidx.annotation.IntDef
import java.lang.annotation.Retention
import java.lang.annotation.RetentionPolicy

/**
 *
 */
object Constants {
    const val MODULE_INIT = 1
    const val MODULE_VISIABLE = 2
    const val MODULE_IN_VISIABLE = 3

    @IntDef(MODULE_INIT, MODULE_VISIABLE, MODULE_IN_VISIABLE)
    @Retention(RetentionPolicy.SOURCE)
    annotation class AnimEnum
    object PayType {
        const val PAY_TYPE_GOOGLE = 1
        const val PAY_TYPE_THIRD = 2
        const val PAY_TYPE_COIN = 3
    }
}