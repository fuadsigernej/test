package com.company;

import java.util.Scanner;

public class Dagligdifference {
    public static void main(String[] args) {

       double man = 21.5 ;
       double tirs = 23.7 ;
       double ons = 19.6 ;
       double tors = 22.5 ;
       double fre = 25.3 ;
       double loer = 21.7 ;
       double soen = 18.8 ;

        double diffone = tirs - man ;
        double difftwo = ons - tirs ;
        double diffthree = tors - ons ;
        double difffour = fre - tors ;
        double difffive = loer - fre ;
        double diffsix = soen - loer ;


        System.out.println("differencen mellem mandag og tirsdag var " + diffone +
                " differencen mellem tirsdag og onsdag var " + difftwo +
                " differencen mellem onsdag og torsdag var " + diffthree +
                " differencen mellem torsdag og fredag var " + difffour +
                " differencen mellem fredag og lørdag var " + difffive +
                " differencen mellem lørdag og søndag var " + diffsix) ;





    }
}
