package com.driver;

// Task 1: Class A
public class A {
    public String meth() {
        return "Invoking method from class A";
    }
}

// Task 2 & 4: Class B extending A and overriding meth
public class B extends A {
    @Override
    public String meth() {
        return "Method is overridden in Extended class B";
    }
}

// Task 3 & 5: Main class to create an object and call the method
public class Main {
    public static void main(String[] args) {
        B b = new B();
        // This will call the overridden method in class B
        System.out.println(b.meth()); // Output: Method is overridden in Extended class B
    }
}
