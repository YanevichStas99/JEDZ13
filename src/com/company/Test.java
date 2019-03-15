package com.company;

public class Test {
    private int number;
    private String s;

    public Test(int number, String s) {
        this.number = number;
        this.s = s;
    }

    private void square(){
        System.out.println(number*number);
    }
    private String UpperCase(){
        return s.toUpperCase();
    }
    private void group(){
        System.out.println(s+" "+ number);
    }
}
