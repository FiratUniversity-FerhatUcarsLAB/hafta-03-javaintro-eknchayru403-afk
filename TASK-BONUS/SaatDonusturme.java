public class SaatDonusturme {
    public static void main(String[] args) {

        // Örnek: Dönüştürülecek saniye değeri
        int toplamSaniye = 3665;

        // --- Dönüşüm Hesaplamaları ---

        // 1. Saati hesaplama (1 saat = 3600 saniye)
        int saat = toplamSaniye / 3600;

        // Kalan saniyeyi bulma
        int kalanSaniye = toplamSaniye % 3600;

        // 2. Dakikayı hesaplama (1 dakika = 60 saniye)
        int dakika = kalanSaniye / 60;

        // 3. En son kalan saniyeyi bulma
        int saniye = kalanSaniye % 60;

        // --- Sonuçları Yazdırma ---

        System.out.println("Saat Dönüştürme:");
        System.out.println("------------------------------------");
        System.out.println("Verilen Saniye: " + toplamSaniye);

        // İstenen formatta çıktıyı yazdırma
        System.out.println(toplamSaniye + " saniye = "
                + saat + ":"
                + dakika + ":"
                + saniye);

        System.out.println("------------------------------------");
    }
}
