// Sadiq Sobur
// CSC 221 Assignment 1

import java.util.Scanner;

public class Assignment1 
{
    public static void taskone()
    {
        // random values for the variables
        int x = 2;
        double y = 4.988941;
        String z = "My name is Sadiq.";

        System.out.println("Value of integer: " + x);
        System.out.println("Value of double: " + y);
        System.out.println("Value of string: " + z);

    }

    public static void tasktwo()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your age: ");
        
        int age = input.nextInt();
        if (age < 18) // check if age is under 18
            System.out.println("You are a minor.");
        else 
            System.out.println("You are an adult.");
        
        
        input.close(); // close the scanner
    }

    public static void printEven()
    {
        for (int i = 1; i <= 20; i++)
        {
            if (i % 2 == 0) // checks if number is even
                System.out.print(i + " ");
        }
    }

    public static void printOdd()
    {
        for (int i = 1; i <= 50; i++)
        {
            if (i % 2 != 0) // checks if number is odd
                System.out.print(i + " ");
        }
    }

    public static int calculateArea(int l, int w)
    {
        return l * w; // A = lw
    }

    public static int calculateFactorial(int n)
    {
        if (n == 1 || n == 0) // base case
            return 1;
        
        return n * calculateFactorial(n - 1);
    }

    public static void main(String[] args)
    {
        // Task 1
        System.out.println("Task 1:");
        taskone();
        
        // Task 2
        System.out.println("\nTask 2:");
        tasktwo();

        // Task 3
        System.out.println("\nTask 3:");
        System.out.println("Evens between 1 and 20 inclusive:");
        printEven();
        System.out.println("\nOdds between 1 and 50 inclusive:");
        printOdd();

        // Task 4
        System.out.println("\n\nTask 4:");
        System.out.println("Length = 10, Width = 4, Area = " + calculateArea(10, 4));
        System.out.println("Length = 9, Width = 2, Area = " + calculateArea(9, 2));
        System.out.println("Length = 14, Width = 20, Area = " + calculateArea(14, 20));
        System.out.println("Length = 6, Width = 15, Area = " + calculateArea(6, 15));
        System.out.println("Length = 8, Width = 3, Area = " + calculateArea(10, 4));

        // Task 5
        System.out.println("\nTask 5:");
        System.out.println("0! = " + calculateFactorial(0));
        System.out.println("1! = " + calculateFactorial(1));
        System.out.println("6! = " + calculateFactorial(6));
        System.out.println("8! = " + calculateFactorial(8));
        System.out.println("12! = " + calculateFactorial(12));
    }    
}
