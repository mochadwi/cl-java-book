package id.or.codelabs;

import id.or.codelabs.model.Karyawan;
import id.or.codelabs.model.Manusia;

public class Tester {
    public static void main(String args[]) {
        //Menentukan indeks nilai
        int nilai = 77;
        char indeks; // nilai indeks, bertipe char
        if (nilai >= 80) {
            indeks = 'A';
        } else if (nilai >= 70) {
            indeks = 'B';
        } else if (nilai >= 60) {
            indeks = 'C';
        } else if (nilai >= 50) {
            indeks = 'D';
        } else {
            indeks = 'E';
        }
        System.out.println("Indeks  dari nilai \"" + nilai + "\" yaitu: " + indeks );
    }
}