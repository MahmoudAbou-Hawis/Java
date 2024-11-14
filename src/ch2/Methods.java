package ch2;

import java.util.Scanner;

public class Methods {

    public static void main(String[] args) {

        System.out.println("Enter the number");
        Scanner scanner = new Scanner(System.in);
        System.out.println(TotalNumbers(scanner.nextInt()));
    }

    public static int  TotalNumbers(int n)
    {
        int sum = 0;
        for(int i = 0; i <= n ;i++)
        {
            sum += i;
        }
        return sum;
    }
}
