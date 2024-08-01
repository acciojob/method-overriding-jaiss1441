package com.driver;


// Task 3 & 5: Main class to create an object and call the method
public class Main {
    public static void main(String[] args) {
        B b = new B();
        // This will call the overridden method in class B
        System.out.println(b.meth()); // Output: Method is overridden in Extended class B
    }
}