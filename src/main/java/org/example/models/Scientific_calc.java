package org.example.models;

import static java.lang.Math.sin;

public class Scientific_calc extends Hybrid_calc {
    public void Sccalculate(int a, int b){
        System.out.println("Your result is:" + sin(a+b));

    }

    public static void main(String[] args) {
        Scientific_calc two = new Scientific_calc();
        two.hcalculate(1,2);
    }
}
