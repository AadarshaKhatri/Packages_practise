package org.example.models;

import static java.lang.Math.sin;

public class Hybrid_calc {
    protected void hcalculate(int a, int b){
        System.out.println("Your result is:" + (a+b));
        System.out.println("Your result is:" + sin(a+b));
    }
}
