package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        C c = new C();
        B b = new B(c);
        A a = new A(b);
        a.methodA();
    }
}
