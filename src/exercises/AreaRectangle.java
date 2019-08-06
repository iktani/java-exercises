package exercises;

import java.util.Scanner;

public class AreaRectangle {
    public static void main(String[] args) {
        float length;
        float width;
        Scanner in;

        in = new Scanner(System.in);
        System.out.println("Please enter the length of the rectangle: ");
        length = in.nextFloat();
        System.out.println("Please enter the width of the rectangle: ");
        width = in.nextFloat();

        System.out.println("The area of your rectangle is " + length*width);
    }
}
