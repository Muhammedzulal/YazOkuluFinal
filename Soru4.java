public class Soru4 {
    public static void main(String[] args) {
        int dizi[] = { -1, 1, 2, 3, 4, 5, 7, 8, 9 };
        System.out.println(hepsiPozitifMi(dizi));
    }

    // Sınava Yazılacak Kısım
    public static boolean hepsiPozitifMi(int dizi[]) {
        for (int i = 0; i < dizi.length; i++) {
            if (dizi[i] <= 0) {
                return false;
            }
        }
        return true;
    }
}
