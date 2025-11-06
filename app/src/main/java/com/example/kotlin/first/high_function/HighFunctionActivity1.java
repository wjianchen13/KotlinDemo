package com.example.kotlin.first.high_function;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;


/**
 * 用来查看Function的相关作用
 */
public class HighFunctionActivity1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

//    public static int num1AndNum2(int num1, int num2, Function operation) {
//        int result = (int) operation.invoke(num1, num2);
//        return result;
//    }
//    public static void main() {
//        int num1 = 100;
//        int num2 = 80;
//        int result = num1AndNum2(num1, num2, new Function() {
//            @Override
//            public Integer invoke(Integer n1, Integer n2) {
//                return n1 + n2;
//            }
//        });
//    }
}