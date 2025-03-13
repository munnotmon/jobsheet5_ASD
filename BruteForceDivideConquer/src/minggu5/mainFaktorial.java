package minggu5;

import java.util.Scanner;

public class mainFaktorial {
    public static void main(String[] args) {
        Scanner input12 = new Scanner(System.in);

        System.out.print("Masukkan nilai: ");
            int nilai = input12.nextInt();

        Faktorial fk = new Faktorial();
            System.out.println("Nilai faktorial " + nilai +
                " Menggunakan BF: " +fk.faktorialBF (nilai));
            System.out.println("Nilai faktorial " + nilai +
                " Menggunakan DC: " + fk.faktorialDC(nilai));
    }  
}
