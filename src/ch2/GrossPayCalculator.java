package ch2;

import java.util.Scanner;

public class GrossPayCalculator {
    public static void main(String[] args) {
        System.out.println("Enter the number of hours the employee worked: ");
        Scanner scanner = new Scanner(System.in);
        int TotalTime = scanner.nextInt();

        System.out.println("Enter the employee's pay rate");
        double PayRate = scanner.nextDouble();


        double grossPay = PayRate * TotalTime;

        System.out.println(grossPay);

    }
}
