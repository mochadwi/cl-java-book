package id.or.codelabs;

public class Tester {
    public static void main(String[] args) {
      double[] larik = {1.9, 2.9, 3.4, 3.5};

      // Tampilkan elemen dari larik
      for (int i = 0; i < larik.length; i++) {
         System.out.println(larik[i] + " ");
      }
     
      // Menjumlahkan semua elemen dalam larik
      double total = 0;
      for (int i = 0; i < larik.length; i++) {
         total += larik[i];
      }
      System.out.println("Nilai total: " + total);
      
      // Mencari nilai terbesar dalam larik
      double maks = larik[0];
      for (int i = 1; i < larik.length; i++) {
         if (larik[i] > maks) maks = larik[i];
      }
      System.out.println("Nilai maksimum: " + maks);
   }
}