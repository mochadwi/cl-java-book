package id.or.codelabs;

public class Tester {
    public static void main(String[] args) {
      try {
         int a[] = new int[2];
         System.out.println("Mengakses elemen di indeks 3, hasilnya: " + a[3]);
      } catch(ArrayIndexOutOfBoundsException e) {
         System.out.println("Exception yang dimunculkan \"" + e.toString() + "\"");
      }
      System.out.println("Di luar block \"try and catch\"");
   }
}