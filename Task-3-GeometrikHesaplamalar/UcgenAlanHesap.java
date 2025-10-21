public class UcgenAlanHesap {
    public static void main ( String [] args ) {
        double taban = 8.0;
        double yukseklik = 6.0;

        // Alan hesapla (Taban * Yükseklik / 2)
        double alan = ( taban * yukseklik ) / 2;

        // Sonuclari yazdir
        System.out.println("Taban Uzunluğu: " + taban);
        System.out.println("Yükseklik: " + yukseklik);
        System.out.println("Alan: " + alan);
    }
}
