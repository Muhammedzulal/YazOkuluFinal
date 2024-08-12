public class Soru2 {
    public static void main(String[] args) {
        String str = "KraKenKatili";
        System.out.println(kucukHarfBul(str));
    }

    // Sınava Yazılacak Kısım
    public static String kucukHarfBul(String str) {
        String newstr = str.toLowerCase();
        String dondurulecekString = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == newstr.charAt(i)) {
                dondurulecekString += str.charAt(i);
            }
        }
        return dondurulecekString;
    }
}