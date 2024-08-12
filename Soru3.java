public class Soru3 {
    public static void main(String[] args) {
        int dizi[][] = new int[3][3];
        int sayi = 1;
        // Diziyi doldurma
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                dizi[i][j] = sayi;
                sayi++;
            }
        }
        // Diziyi yazdırma
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(dizi[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println(maksSayi(dizi));
    }

    // Sınava Yazılacak Kısım
    public static int maksSayi(int dizi[][]) {
        int maks = dizi[0][0];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (dizi[i][j] > maks) {
                    maks = dizi[i][j];
                }
            }
        }
        return maks;
    }
}
