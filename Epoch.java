package com.company;

public class Epoch {
    public static void main(String[] args) {
        long totalmilliseconds = System.currentTimeMillis();
        long totalSeconds = totalmilliseconds/1000 ;
        long totalminutes = totalSeconds/60 ;
        long totalhours = totalminutes/60 ;
        long totaldays = totalhours/24 ;
        long totalyears = totaldays/365;
        System.out.println("Totale år efter 1. januar " + totalyears + " og totale dage " + totaldays);


    }
}
