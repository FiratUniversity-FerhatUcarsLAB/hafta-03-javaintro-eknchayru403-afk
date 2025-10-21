public class CarpimTablosu {
    public static void main(String[] args) {

        int carpan = 2; // Çarpım tablosunu oluşturacağımız sayı
        int baslangic = 1;
        int bitis = 10;

        System.out.println(carpan + "'nin Çarpım Tablosu (" + baslangic + " - " + bitis + "):");
        System.out.println("-------------------------");

        // Çarpım tablosunu 1'den 10'a kadar oluşturmak için döngü
        for (int i = baslangic; i <= bitis; i++) {

            int sonuc = carpan * i;

            // Sonucu "2 x i = Sonuç" formatında yazdır
            System.out.println(carpan + " x " + i + " = " + sonuc);
        }

        System.out.println("-------------------------");
    }
}
