package minggu5;

import java.util.Scanner;

public class mainSum {
public static void main(String[] args) {
        Scanner input12 = new Scanner(System.in);

        System.out.print("Masukkan jumlah elemen: ");
        int elemen = input12.nextInt();

        sum sm = new sum (elemen);
        for (int i = 0; i < elemen; i++){
            System.out.println("Masukkan elemen ke-" + (i + 1) + ": ");
            sm.keuntungan[i] = input12.nextDouble();
        }
        System.out.println("Total keuntungan menggunakan Brute Force: " + sm.totalBF());
        System.out.println("Total keuntungan menggunakan Divide and Conquer: " + sm.totalDC(sm.keuntungan, 0, elemen - 1));
    }
}