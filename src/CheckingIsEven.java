/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 28-Jul-20
 *  Time: 10:33 AM
 */

import java.util.Scanner;

// Create a method to check whether the given input is even.
public class CheckingIsEven {
    public static void main(String[] args) {
        System.out.println("enter an integer");
        Scanner sc = new Scanner(System.in);
        int no1 = sc.nextInt();
        CheckingIsEven object = new CheckingIsEven();
        boolean result = object.isEven(no1);
        System.out.println("given number is Even --> " + result);

    }
    //declaring and defining isEven method which accept one argument of type int, and
    //returns true if input is even or return false

    public boolean isEven(int no1) {
        boolean response = false;
        if (no1 % 2 == 0) {
            response = true;
        }
        return response;
    }
}
