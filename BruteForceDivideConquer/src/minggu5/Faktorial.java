package minggu5;

import java.util.Scanner;

public class Faktorial {
    int nilai;

public int faktorialBF (int n) {
    int fakto = 1;
        for (int i = 1; i <= n; i++) {
            fakto = fakto * i;
     }
        return fakto;
    }

    int faktorialDC (int n) {
        if (n == 1) {
            return 1;
        } else {
            int fakto = n * faktorialDC (n-1);
            return fakto;
        }
    }
}
