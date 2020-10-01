package com.company;

import java.util.Scanner;
public class Arealafcirkler {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the radius of your circle");

        double radius = input.nextDouble();
        double area = radius * radius * 3.14;

        System.out.println("The area of the circle is " + area);

        System.out.println("Enter a new radius of a new circle");

        double radiustwo = input.nextDouble();
        double areatwo = radiustwo * radiustwo * 3.14;

        System.out.println("The area of the circle is " + areatwo);

        System.out.println("Enter a new radius of a new circle");


        double radiusthree = input.nextDouble();
        double areathree = radiusthree * radiusthree * 3.14;

        System.out.println("The area of the circle is " + areathree);






    }
}
