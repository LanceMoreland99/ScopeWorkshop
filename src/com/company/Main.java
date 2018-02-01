package com.company;

public class Main {


    private String memberVariable = "I amd a member variable, I have a class level scope";

    private int memberInt = 10;
    private int count = 0;

    public static void main(String[] args) {

        Main main = new Main();
        main.aMethod();

    }
    private void  aMethod() {

        String localVariable = "i am a local variable i can only be used in this method.";

        System.out.println("inside first method");
    }
}
