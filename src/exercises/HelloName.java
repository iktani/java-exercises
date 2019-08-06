package exercises;

import java.util.Scanner;

public class HelloName {
    public static void main(String[] args) {
        String username;
        Scanner in;

        in = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        username = in.next();

        System.out.println("Hello " + username);


    }
}
