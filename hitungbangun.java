import java.util.Scanner;
public class hitungbangun {

public static vouid main(String[] arg) {
  Scanner input = new Scanner(System.in);

  System.out.println("Menu: ");
  System.out.println("1. Menghitung luas dan keliling persegi panjang");
  System.out.println("2. Menghitung luas dan keliling lingkaran");
  System.out.println("3. Menghitung luas dan keliling segitiga");
  System.out.print("Pilihan anda: ");
  int pilihan = input.nextInt();

  switch (pilihan) {
    case 1:
      System.out.print("Masukkan panjang: ");
      double panjang = inputnextDouble();

      double kelilingPP = 2 * (panjang + lebar);
      double lebarPP = panjang * lebar;

       System.out.println("Keliling persegi panjang : " + kelilingPP + " cm");
       System.out.println("Luas persegi panjang : " + lebarPP + " cm2");
      break;

    case 2:
       System.out.println("Masukkan jari-jari: ");
      
  
