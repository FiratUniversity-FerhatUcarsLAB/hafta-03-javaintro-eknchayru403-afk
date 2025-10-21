public class MilKilometreTablosu {
    public static void main(String[] args) {

        // --- Sabit Tanımlama ---
        final double MIL_TO_KM_ORANI = 1.609; // 1 mil = 1.609 kilometre

        // --- Dönüşecek Mil Değerleri Dizisi ---
        double[] milDegerleri = {1.0, 5.0, 10.0, 20.0, 50.0};

        System.out.println("Dönüşüm Oranı: 1 Mil = " + MIL_TO_KM_ORANI + " KM");
        System.out.println("------------------------------------");

        // Tablo başlıkları (sağa hizalı)
        System.out.printf("%10s %5s %15s%n", "Mil", "->", "Kilometre");
        System.out.println("------------------------------------");

        // --- Dönüşüm ve Tabloya Yazdırma Döngüsü ---
        for (double mil : milDegerleri) {

            // Kilometre hesaplaması
            double kilometre = mil * MIL_TO_KM_ORANI;

            // Sonucu tablo formatında yazdırma (iki ondalık basamak hassasiyeti ile)
            System.out.printf("%10.1f %5s %15.3f%n", mil, "->", kilometre);
        }

        System.out.println("------------------------------------");
    }
}
