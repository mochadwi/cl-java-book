package id.or.codelabs.model;

/**
 * Created by mochadwi on 4/26/17.
 */
public class Manusia {
    //Variabel umur menjadi variabel global
    public static int umur = 0;

    public void tambahUmur() {
//        int umur = 0;
        umur = umur + 7;
        System.out.println("Umur setelah bertambah: " + umur);
    }

    //getter untuk kelas id.or.codelabs.model.Manusia
    public void getUmur() {
        System.out.println("Umur saat ini: " + umur);
    }
}