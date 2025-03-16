package minggu5;

public class nilaiMahasiswa {
    int[] uts = {78, 85, 90, 76, 92, 88, 80, 82}; 
    int[] uas = {82, 88, 87, 79, 95, 85, 83, 84}; 

    public int nilaiTertinggi(int l, int r) {
        if (l == r) return uts[l]; 

        int nilaiTengah = (l + r) / 2;
        int lTertinggi = nilaiTertinggi (l, nilaiTengah);
        int rTertinggi = nilaiTertinggi (nilaiTengah + 1, r);

        if (lTertinggi > rTertinggi) return lTertinggi;
        else return rTertinggi;
    }

    public int nilaiTerendah(int l, int r) {
        if (l == r) return uts[l]; 

        int nilaiTengah = (l + r) / 2;
        int lTerendah = nilaiTerendah(l, nilaiTengah);
        int rTerendah = nilaiTerendah(nilaiTengah + 1, r);

        if (lTerendah < rTerendah) return lTerendah;
        else return rTerendah;
    }

    public double rataRataUAS() {
        int total = 0;
        for (int nilai : uas) {
            total += nilai;
        }
        return (double) total / uas.length;
    }
}
