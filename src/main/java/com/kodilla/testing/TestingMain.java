package com.kodilla.testing;

import com.kodilla.testing.calculator.SimpleCalc;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args) {
        System.out.println("Moduł 6. Wprowadzenie do testowania oprogramowania");
        SimpleUser simpleUser = new SimpleUser("theForumUser");
        String result = simpleUser.getUsername();
        if (result.equals("theForumUser")) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }
        SimpleCalc simpleCalc = new SimpleCalc(5,3);
        int addresult = simpleCalc.add();
        int subresult = simpleCalc.sub();

        if (addresult == 8 && subresult == 2){
            System.out.println("Calc test OK");
        }else{
            System.out.println("Error!");
        }









    }
}