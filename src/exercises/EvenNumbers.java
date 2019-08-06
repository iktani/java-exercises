package exercises;

import java.util.Scanner;
import java.util.ArrayList;

public class EvenNumbers {

    public static void main(String[] args) {

        ArrayList<Integer> evenList = new ArrayList<>();
        Integer newNumber;
        Integer newTotal;
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a number (or ENTER 999 to finish):");

        // Get student names
        do {
            newNumber = in.nextInt();

            if (newNumber != 999) {
                evenList.add(newNumber);
            }

        } while(newNumber != 999);

        newTotal = total(evenList);

        System.out.println("Sum of all even numbers is: " + newTotal);

    }

    private static Integer total(ArrayList<Integer> numList) {
        Integer runningTotal = 0;

        for (Integer num : numList) {
            if (num % 2 == 0) {
                runningTotal+= num;
            }
        }
        return runningTotal;
    }
}
