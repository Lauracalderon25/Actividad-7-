package com.lauracalderon;

public class NumPrimo {

    int numero[] = { 4, 12, 25, 31, 47, 39, 20, 8, 20, 35, 63, 91, 100, 5 };
    int i, cont=0 ;
    public void ImprimePrimo (){
        for(i=0;i<numero.length;i++)
        {
            int div=0;
            for (int j=1; j<=numero[i] ; j++) {
                if (numero[i] % j == 0) {
                    div++;
                }
            }
            if (div==2)
            {
                System.out.print(String.valueOf(numero[i])+",");


            }

        }
    }
}

