public class VucutKitleIndeksi {
    public static void main(String[] args) {
        double kilo_kg = 75.0;
        double boy_m = 1.75;

        double bmi = kilo_kg / (boy_m * boy_m);


        System.out.println("Vücut Kitle İndeksi (BMI) Hesaplama:");
        System.out.println("------------------------------------");

        System.out.println("Kilo (kg): " + kilo_kg);
        System.out.println("Boy (m): " + boy_m);

        System.out.printf("BMI Değeri: %.2f%n", bmi);

        System.out.println("------------------------------------");
    }
}
