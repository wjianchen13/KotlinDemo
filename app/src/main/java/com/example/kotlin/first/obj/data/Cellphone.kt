package com.example.kotlin.first.obj.data

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
        return brand.hashCode() + (int) price;
    }
    @Override
    public String toString() {
        return "Cellphone(brand=" + brand + ", price=" + price + ")";
    }
}*/
data class Cellphone(val brand: String, val price: Double)