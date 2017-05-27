package id.or.codelabs;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Tester {
    public static void main(String[] args) {
        List number = new ArrayList<String>();
        number.add("satu");

        Iterator it = number.iterator(); // membuat list bisa diiterasi

        while (it.hasNext()) {
            try {
                Integer i = (Integer) it.next();
            } catch (ClassCastException e) {
                System.out.println("Exception yang dimunculkan \"" + e.toString() + "\"");
            }
        }
        System.out.println("Di luar block \"try and catch\"");
    }
}