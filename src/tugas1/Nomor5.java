/*
 * Arif Fridasari Mengerjakan bagian Method Decrement
 */
package tugas1;

import java.util.ArrayList;
import java.util.List;

/**
 * Class Decrement merupakan class untuk fungsi auto decrement / pengurangan
 * nilai dari variabel a dan b variabel a adalah batas minimum / nilai akhir
 * dari pengurangan / decrement variabel b adalah nilai awal / batas atas akhir
 * dari decrement
 *
 * @author Arif Fridasari
 */
public class Nomor5 {
     public static void main(String[] args) {
        List<String> dec = decrement(3, 15);
//        System.out.println(dec);
        for (String string : dec) {
            System.out.print(string + ", ");
        }
    }

    private static List<String> decrement(int a, int b) {
        List<String> dec = new ArrayList<>();
        for (int i = b; i >= a; i--) {
            String y = Integer.toString(i);
            while (y.length() < Integer.toString(b).length()) {
                y = "0" + y;
            }
            dec.add(y);
        }
        return dec;
    }
}
