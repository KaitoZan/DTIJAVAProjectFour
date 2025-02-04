package com.sau.wow;

public class Test01 {
    public static void main(String[] args) {

        DtiSAU mod;
        mod = new DtiSAU();

        DtiSAU med = new DtiSAU();

        mod.name = "สมชาย";
        System.out.println(mod.name+" สูง "+mod.high);

        med.name = "สมศรี";
        med.showHi();


    }
}
