package ch2;

import Rectangle.Rect;

import java.util.Scanner;

public class classes2
{
    public static void main(String[] args) {
        classes2 c = new classes2();
        Rect room = c.getRoom();
        System.out.println(room.getArea());
    }

    public Rect getRoom()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Length: ");
        int length = scanner.nextInt();
        System.out.print("Enter Width: ");
        int width = scanner.nextInt();
        return new Rect(length,width);
    }
}
