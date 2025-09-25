import java.util.Scanner;
public class laprak {
  public static void main(String[] args) {
   int operatorawal,operatorakhir;
    Scanner input = new Scanner(System.in);
    System.out.print("Masukkan operator pertama: ");
    operatorawal = input.nextIn();
    Systme.out.print("Masukkkan operator kedua: ");
    operatorakhir = input.nextInt():
      int penambahan = operatorawal + operatorakhir;
      int pengurangan = operatorawal - operatorakhir;
      perkalian = operatorawal * operatorakhir;
      double pembagian = (double) operatorawal / operatorakhir;
    System.out.println("Hasil penjumlahan : " + penambahan);
    System.out.println("Hasil pengurangan : " + pengurangan);
    System.out.println("Hasil perkalian : " + perkalian);
    System.out.printf("Hasil pembagian   : %.1f",  pembagian);
  }
}
    
