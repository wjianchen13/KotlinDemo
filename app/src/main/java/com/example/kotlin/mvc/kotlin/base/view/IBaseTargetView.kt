package com.example.kotlin.mvc.kotlin.base.view

import com.example.kotlin.mvc.kotlin.base.module.BaseModule

/**
 * 使用对象：Fragment Activity
 */
interface IBaseTargetView {

    fun addModule(module: BaseModule<*, *>?)
    fun removeModule(module: BaseModule<*, *>?)

}