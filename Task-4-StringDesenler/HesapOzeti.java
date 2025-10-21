public class HesapOzeti {
    public static void main(String[] args) {

        // --- Başlıkları ve Formatı Tanımlama ---

        // Başlıkları ve tablo çizgilerini yazdırma
        System.out.println("Hesap Özeti:");
        System.out.println("-------------------------------------------------");

        // Tablo başlıkları için format: Ürün (15 karakter sola hizalı), Miktar (10 karakter sağa hizalı), Fiyat (15 karakter sağa hizalı)
        System.out.printf("%-15s %10s %15s%n", "Ürün", "Miktar", "Fiyat (TL)");
        System.out.println("-------------------------------------------------");

        // --- Alışveriş Listesi Verileri ---

        // 1. Ürün
        String urun1 = "Ekmek";
        int miktar1 = 2;
        double fiyat1 = 8.50;

        // 2. Ürün
        String urun2 = "Süt";
        int miktar2 = 1;
        double fiyat2 = 22.90;

        // 3. Ürün
        String urun3 = "Peynir";
        int miktar3 = 500; // gram
        double fiyat3 = 85.00;

        // --- Verileri Tabloya Yazdırma ---

        // Format: %-15s (String), %10d (Integer), %15.2f (2 ondalıklı sayı)
        System.out.printf("%-15s %10d %15.2f%n", urun1, miktar1, fiyat1);
        System.out.printf("%-15s %10d %15.2f%n", urun2, miktar2, fiyat2);
        System.out.printf("%-15s %10d %15.2f%n", urun3, miktar3, fiyat3);

        System.out.println("-------------------------------------------------");
    }
}
