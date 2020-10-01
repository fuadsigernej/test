package com.company;

public class sqrt {
    public static void main(String[] args) {
        System.out.println(squared(7));
        System.out.println(squared(10));
        System.out.println(squared(12));

    }

    public static double squared (double num) {
        double guess = 5000;
        double maxguess =  1000000000;
        double minguess = 0.000000001;
        int tries =  0;
        double sGuess = 0;
        do{
            sGuess = guess * guess;
            if (sGuess == num) {
                return num;
            }

            if(sGuess > num) {
                maxguess = guess;
            }

            else {
                minguess = guess;
            }

            guess = (minguess+maxguess)/2;
            tries++;

        }while(tries < 100000); {

            System.out.println("Couldn't find under 100000 tries, returning best result");
            return guess;
        }


    }
}
