public class ParaBozma {
    public static void main(String[] args) {

        int toplamMiktar = 278; 
        int kalanMiktar = toplamMiktar;

        int yuzluk = 100;
        int ellilik = 50;
        int yirmilik = 20;
        int onluk = 10;
        int beslik = 5;
        int ikilik = 2;
        int birlik = 1;

        System.out.println("Para Bozma:");
        System.out.println("----------------------------------------");
        System.out.print(toplamMiktar + " TL = ");

        String cikti = "";

        int adet100 = kalanMiktar / yuzluk;
        if (adet100 > 0) {
            cikti += adet100 + "x" + yuzluk + ", ";
            kalanMiktar %= yuzluk;
        }

        int adet50 = kalanMiktar / ellilik;
        if (adet50 > 0) {
            cikti += adet50 + "x" + ellilik + ", ";
            kalanMiktar %= ellilik;
        }

        int adet20 = kalanMiktar / yirmilik;
        if (adet20 > 0) {
            cikti += adet20 + "x" + yirmilik + ", ";
            kalanMiktar %= yirmilik;
        }

        int adet10 = kalanMiktar / onluk;
        if (adet10 > 0) {
            cikti += adet10 + "x" + onluk + ", ";
            kalanMiktar %= onluk;
        }

        int adet5 = kalanMiktar / beslik;
        if (adet5 > 0) {
            cikti += adet5 + "x" + beslik + ", ";
            kalanMiktar %= beslik;
        }

        int adet2 = kalanMiktar / ikilik;
        if (adet2 > 0) {
            cikti += adet2 + "x" + ikilik + ", ";
            kalanMiktar %= ikilik;
        }

        int adet1 = kalanMiktar / birlik;
        if (adet1 > 0) {
            cikti += adet1 + "x" + birlik;

        }

        if (cikti.endsWith(", ")) {
            cikti = cikti.substring(0, cikti.length() - 2);
        }

        System.out.println(cikti);
        System.out.println("----------------------------------------");
    }
}
