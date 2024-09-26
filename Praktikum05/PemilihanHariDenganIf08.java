package Praktikum05;

import java.util.Scanner;
public class PemilihanHariDenganIf08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      
        System.out.print("Masukkan sebuah angka untuk mewakilkan hari (1 sampai 7): ");
        int angka = sc.nextInt();
        if (angka == 1)
        {
            System.out.println("Hari ke-" + angka + " adalah weekday");
        }
        if (angka == 2)
        {
            System.out.println("Hari ke-" + angka + " adalah weekday");
        }
        if (angka == 3)
        {
            System.out.println("Hari ke-" + angka + " adalah weekday");
        }
        if (angka == 4)
        {
            System.out.println("Hari ke-" + angka + " adalah weekday");
        }
        if (angka == 5)
        {
            System.out.println("Hari ke-" + angka + " adalah weekday");
        }
        if (angka == 6)
        {
            System.out.println("Hari ke-" + angka + " adalah weekend");
        }
        if (angka == 7)
        {
            System.out.println("Hari ke-" + angka + " adalah weekend");
        }
        if (angka == 0 )
        {
            System.out.println("Invalid number");
        }
        if (angka > 7 )
        {
            System.out.println("Invalid number");
        }
    }
}