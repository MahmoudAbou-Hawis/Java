package ch2;

import java.util.Scanner;

public class Arrays {
    private static int grades[];

    public static void main(String[] args) {
        System.out.println("Enter the Number of Elements");
        Scanner scanner = new Scanner(System.in);
        grades = new int[scanner.nextInt()];
        for(int element = 0 ; element < grades.length ; element++)
        {
            grades[element] = scanner.nextInt();
        }
        System.out.println("Sum = " + calculateSum(grades));
    }

    private static int calculateSum(int [] array)
    {
        var sum = 0 ;

        for(int element : array)
        {
            sum += element;
        }
        return sum;
    }
}
