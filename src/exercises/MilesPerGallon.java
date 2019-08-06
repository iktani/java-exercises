package exercises;
import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args) {
        float milesDriven;
        float gasUsed;
        float mpg;
        Scanner in;

        in = new Scanner(System.in);
        System.out.println("Please enter the miles driven: ");
        milesDriven = in.nextFloat();
        System.out.println("Please enter the amount of gas used (in gallons): ");
        gasUsed = in.nextFloat();

        mpg = milesDriven / gasUsed;
        System.out.println("Your miles per gallon is: " + mpg);
    }
}
