package id.or.codelabs;

public class Tester {
    static class Mahasiswa {
        static String name;

        public Mahasiswa() {
            name = null;
        }

        @Override
        public String toString() {
            return name;
        }
    }

    public static void main(String[] args) {
      try {
          Mahasiswa doni = new Mahasiswa();
          doni.name.toString();
      } catch(NullPointerException e) {
         System.out.println("Exception yang dimunculkan \"" + e.toString() + "\"");
      }
      System.out.println("Di luar block \"try and catch\"");
   }
}