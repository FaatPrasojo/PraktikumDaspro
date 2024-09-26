package Praktikum05;

import java.util.Scanner;
public class PemilihanHariDenganIf08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      
        System.out.print("Enter a number to represent the day (1 to 7): ");
        int angka = sc.nextInt();
        if (angka == 1 || angka == 2 || angka == 3 || angka == 4 || angka == 5)
        {
            System.out.println("Day " + angka + " is the weekday");
        }
        if (angka == 6 || angka == 7)
        {
            System.out.println("Day " + angka + " is the weekend");
        }
        if (angka > 7 || angka == 0 )
        {
            System.out.println("Invalid number");
        }
        
    }
}