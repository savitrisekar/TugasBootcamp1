/*
 * Arif Fridasari Mengerjakan Nomor 1 Bagian Method Pemangkatan dan Kombinasi;
 */
package tugas1;
/**
 * Class Nomor1 yang digunakan untuk membuat nilai kembali dengan dua variabel a
 * dan b untuk menentukan nilai kombinasi dan perpangkatan dengan nama fungsi
 * kombinasi dan pangkat.
 *
 * @author ARIF FRIDASARI
 */
public class Nomor1 {

    /**
     * Nomor1 kombinasi yang digunakan untuk mencari nilai kombinasi dari 2 buah
     * nilai a dan b
     *
     * @param a
     * @param b
     * @return
     */
    public int kombinasi(int a, int b) {
        int awal = 1;
        int btsbwh = 1;
        int bts = 1;
        for (int f = a; f >= 1; f--) {
            awal *= f;
        }
        int bwh = (a - b);
        for (int h = bwh; h >= 1; h--) {
            btsbwh *= h;
        }
        for (int j = b; j >= 1; j--) {
            bts *= j;
        }
        int hasilkom = (awal / (btsbwh * bts));
        return hasilkom;
    }

    /**
     * Nomor1 pangkat untuk menghitung nilai pangkat dari nilai a dan nilai
     * pangkatnya b
     *
     * @param a
     * @param b
     * @return
     * @ARIF FRIDASARI
     */
    public double pangkat(double a, double b) {
        double hasilpem = 1;
        double z = 1;
        if (b > 0) {
            while (z <= b) {
                hasilpem = hasilpem * a;
                z++;
            }
        } else {
            while (z <= Math.abs(b)) {
                hasilpem = hasilpem / a;
                z++;
            }
        }

        return hasilpem;
    }

    public static void main(String[] args) {
        Nomor1 fungsi = new Nomor1();
        System.out.println("Hasil Pemangkatan : " + fungsi.pangkat(5, 4));
        System.out.println("Hasil Pemangkatan : " + fungsi.pangkat(5, -4));
        System.out.println("Hasil Kombinasi : " + fungsi.kombinasi(5, 4));

    }

}
