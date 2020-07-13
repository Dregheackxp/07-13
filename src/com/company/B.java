package com.company;

public class B {
  private C c;

    public B(C c) {
        this.c = c;
    }
    public int method(){
       return this.c.wrongMethod(3);
    }
}
