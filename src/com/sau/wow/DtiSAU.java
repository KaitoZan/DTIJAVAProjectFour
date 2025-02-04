package com.sau.wow;

public class DtiSAU {
    String name;
    int birthYear;
    int age;
    double high = 100;


    public void showHi() {
        System.out.println("Hi..." + name);

    }

    public void calAndShowAge() {
        age = 2568 - birthYear;
        System.out.println("your age : "+age);
    }
}