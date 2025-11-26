import java.util.Scanner;

public class NotHesaplama {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Vize notunu giriniz: ");
        double vize = input.nextDouble();

        System.out.print("Final notunu giriniz: ");
        double finalNotu = input.nextDouble();

        // Ağırlıklı ortalama hesaplama
        double ortalama = (vize * 0.40) + (finalNotu * 0.60);

        System.out.println("Ortalamanız: " + ortalama);

        // Geçme durumu
        if (ortalama >= 60) {
            System.out.println("Durum: Geçtiniz!");
        } else {
            System.out.println("Durum: Kaldınız.");
        }

        input.close();
    }
}
