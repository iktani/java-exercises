package org.launchcode.java.studios;

import java.util.Scanner;

public class AreaCircle {
    public static void main(String[] args) {
        double radius;
        //double pi = 3.14;
        double area;
        Scanner in;

        in = new Scanner(System.in);
        System.out.println("Please enter the radius of your circle: ");
        radius = in.nextDouble();
        area = Math.PI * Math.pow(radius,2);

        System.out.println("The area of a circle with radius " + radius + " is " + area);



    }
}
