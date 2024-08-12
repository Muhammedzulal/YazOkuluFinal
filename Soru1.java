public class Soru1 {
    public static void main(String[] args) {
        int array[] = { 10, 10, 10, 10 };
        int index = 0;
        int bulunandizi[] = dondur(array, index);
        // Yazdırmak için for each
        for (int number : bulunandizi) {
            System.out.println(number);
        }
    }

    // Sınava Yazılacak Kısım
    public static int[] dondur(int array[], int index) {
        // Baz durum: Dizinin sonuna ulaştıysak (index >= array.length), diziyi döndür
        if (index >= array.length) {
            return array;
        }

        // Dizinin geçerli elemanını 1 azalt
        array[index]--;

        // Sonraki eleman için aynı işlemi yap (rekürsif çağrı)
        return dondur(array, index + 1);

    }
}
