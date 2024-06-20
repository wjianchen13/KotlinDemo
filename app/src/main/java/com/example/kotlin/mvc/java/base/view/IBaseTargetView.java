package com.example.kotlin.mvc.java.base.view;

import com.example.kotlin.mvc.java.base.module.BaseModule;

/**
 * 使用对象：Fragment Activity
 */
public interface IBaseTargetView {

    void addModule(BaseModule module);
    void removeModule(BaseModule module);

}
