package com.company;

public class A {
private B b;

    public A(B b) {
        this.b = b;
    }
    public void methodA(){
        try {
             this.b.method();
        }catch (ArithmeticException e){
            System.out.println("Dalyba is 0");
        }
    }
}
