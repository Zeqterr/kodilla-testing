package com.kodilla.testing.calculator;

public class SimpleCalc {
    int a;
    int b;
    public SimpleCalc(int a,int b){
        this.a = a;
        this.b = b;
    }
    public int add(){
        return a+b;
    }

    public int sub(){
        return a-b;
    }
}
