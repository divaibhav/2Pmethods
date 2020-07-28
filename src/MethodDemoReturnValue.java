/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 28-Jul-20
 *  Time: 10:18 AM
 */
//Create a method called add, which accept two integer arguments and return there sum as integer
// accept numbers from user

import java.util.Scanner;

public class MethodDemoReturnValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter two integers");
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        //calling a static function by name from static method main
        int result = add(number1, number2);
        System.out.println("sum = " + result);
        sc.close();

    }

    //declaring and defining add method
    public static int add(int no1, int no2) {
        // declaring a variable response, that will act as a return variable
        int response = 0;
        //performing task
        response = no1 + no2;

        //return statement
        return response;
    }
}
