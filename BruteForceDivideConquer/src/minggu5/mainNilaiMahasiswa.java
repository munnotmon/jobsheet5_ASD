package minggu5;

public class mainNilaiMahasiswa {
    public static void main(String[] args) {
        nilaiMahasiswa nilai = new nilaiMahasiswa();

        System.out.println("\nNilai UTS Tertinggi: " + nilai.nilaiTertinggi(0, nilai.uts.length - 1));
        System.out.println("Nilai UTS Terendah: " + nilai.nilaiTerendah(0, nilai.uts.length - 1));
        System.out.println("Rata-rata Nilai UAS: " + nilai.rataRataUAS());
    }
}
