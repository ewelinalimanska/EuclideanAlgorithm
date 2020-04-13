package com.kodilla.kodillacourse;

public class Algorytm {

    int algorytm (int a, int b) {
        System.out.print("Największym wspólnym dzielnikiem " + a + " i " + b + " jest ");
        while (a != b) {
            if (a > b) {
                a -= b;
            }else{
                b -= a;
            }
        }
        return a;
    }

    public static void main(String[] args) {


        {
            Algorytm Euklides = new Algorytm();
            System.out.println(Euklides.algorytm(354,432));
        }

    }
}


