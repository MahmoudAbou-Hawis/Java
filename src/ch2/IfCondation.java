package ch2;

import java.util.Scanner;

public class IfCondation
{
    public static void main(String[] args) {
        System.out.print("Enter Your Age: ");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        if(age < 18)
        {
            System.out.println("Baby");
        }
        else if(age < 25)
        {
            System.out.println("teenager");
        }
        else {
            System.out.println("old");
        }
    }
}
