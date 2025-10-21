public class Faktoriyel {
    static void main(String[] args) {
int n = 5;
        long faktoriyelsonucu = 1;
        System.out.println(n + "! hesaplaması");
        System.out.println(n + "! = ");
        for (int i = n; i >= 1; i--) {
            if (i > 1) {
                System.out.print(" × ");
                System.out.println(" = " + faktoriyelsonucu);
        }

    }
}
}
