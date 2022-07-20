package com.example.kotlin.normal.obj

/* Java实现
public class Cellphone {
    String brand;
    double price;
    public Cellphone(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Cellphone) {
            Cellphone other = (Cellphone) obj;
            return other.brand.equals(brand) && other.price == price;
        }
        return false;
    }
    @Override
    public int hashCode() {
        第 2 章 探究新语言，快速入门 Kotlin 编程 82return brand.hashCode() + (int) price;
    }
    @Override
    public String toString() {
        return "Cellphone(brand=" + brand + ", price=" + price + ")";
    }
}*/

/**
 * 当在一个类前
 * 面声明了data关键字时，就表明你希望这个类是一个数据类， Kotlin会根据主构造函数中的参
 * 数帮你将equals()、 hashCode()、 toString()等固定且无实际逻辑意义的方法自动生成，
 * 从而大大减少了开发的工作量
 */
data class Cellphone(val brand: String, val price: Double)