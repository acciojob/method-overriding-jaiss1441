package com.driver;


class A {
    public String meth() {
        return "Invoking method from class A";
    }
}

// Task 2 & 4: Class B extending A and overriding meth
class B extends A {
    @Override
    public String meth() {
        return "Method is overridden in Extended class B";
    }
}

public class Main {
    public static void main(String[] args){


        B b = new B();
        // Calling method meth from class A using an object of class B
        System.out.println(b.meth());
    }
  
}