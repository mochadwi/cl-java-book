package id.or.codelabs;

public class Tester {
    public static void main(String[] args) {
      try {
         Object obj = null;
         obj.toString();
      } catch(NullPointerException e) {
         System.out.println("Exception yang dimunculkan \"" + e.toString() + "\"");
      }
      System.out.println("Di luar block \"try and catch\"");
   }
}