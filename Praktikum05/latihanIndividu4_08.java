package Praktikum05;

import java.util.Scanner;
public class latihanIndividu4_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      
        System.out.print("Masukkan Usia: ");
        int usia = sc.nextInt();
        if (usia >= 0 && usia <= 12 )
        {
            System.out.println("Maka kategori usia sebagai: Anak");
        }
       else if (usia >= 13 && usia <= 19)
        {
            System.out.println("Maka kategori usia sebagai: Remaja");
        }
       else if (usia >= 20 && usia <= 64 )
        {
            System.out.println("Maka kategori usia sebagai: Dewasa");
        }
        else if ( usia >= 65)
        {
            System.out.println("Maka kategori usia sebagai: Lansia");
        }
        
    }
}