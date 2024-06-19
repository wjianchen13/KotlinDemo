package com.example.kotlin.practice.test4

/**
public class SingletonTestJ {

private static SingletonTestJ INSTANCE;

private SingletonTestJ() {

}

public static SingletonTestJ getInstance() {
if (INSTANCE == null) {
synchronized (SingletonTestJ.class) {
if (INSTANCE == null) {
INSTANCE = new SingletonTestJ();
}
}
}
return INSTANCE;
}

}
 */

/**
 * 转换成kotlin之后的代码，这个不能直接使用，只能用来看和SingletonTest有什么区别
 */
class SingletonTestJ private constructor() {
    private var INSTANCE: SingletonTestJ? = null
    val instance: SingletonTestJ?
        get() {
            if (INSTANCE == null) {
                synchronized(SingletonTestJ::class.java) {
                    if (INSTANCE == null) {
                        INSTANCE = SingletonTestJ()
                    }
                }
            }
            return INSTANCE
        }
}