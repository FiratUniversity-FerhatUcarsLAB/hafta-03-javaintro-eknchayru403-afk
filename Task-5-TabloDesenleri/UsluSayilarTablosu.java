public class UsluSayilarTablosu {
    public static void main(String[] args) {

        int baslangic = 1;
        int bitis = 5;

        System.out.println("Üslü Sayılar Tablosu:");
        System.out.println("a değerleri 1'den 5'e kadar hesaplanmıştır.");
        System.out.println("------------------------------------");

        // Tablo başlıkları (sola ve sağa hizalı karışık format)
        System.out.printf("%-5s %8s %8s%n", "a", "a^2", "a^3");
        System.out.println("------------------------------------");

        // Hesaplama ve Tabloya Yazdırma Döngüsü
        for (int a = baslangic; a <= bitis; a++) {

            // a^2 ve a^3 hesaplamaları
            int aKare = a * a;
            int aKup = a * a * a;

            // Sonuçları tablo formatında yazdırma
            // %-5d (sol hizalı integer), %8d (sağ hizalı integer)
            System.out.printf("%-5d %8d %8d%n", a, aKare, aKup);
        }

        System.out.println("------------------------------------");
    }
}
