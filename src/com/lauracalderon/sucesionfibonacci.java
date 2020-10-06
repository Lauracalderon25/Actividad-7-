package com.lauracalderon;

public class sucesionfibonacci {
    int[] s = new int [20];
    public int var = 1, a = 0, b = 0;
    public void Sucesion(){
        for (int s = 0; s<20; s++){
            System.out.print(String.valueOf(b)+",");
            a=b;
            b = var;
            var = a + b;
        }
    }

}


