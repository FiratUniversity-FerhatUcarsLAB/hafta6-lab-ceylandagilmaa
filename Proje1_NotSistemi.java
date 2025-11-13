import java.util.Scanner;

public class NotDegerlendirme {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 1️⃣ Öğrenci bilgilerini al
        System.out.print("Öğrencinin adı: ");
        String ad = input.nextLine();

        System.out.print("Öğrencinin numarası: ");
        String numara = input.nextLine();

        // 2️⃣ Notları al
        System.out.print("Ödev notu (0-100): ");
        double odev = input.nextDouble();

        System.out.print("Vize notu (0-100): ");
        double vize = input.nextDouble();

        System.out.print("Final notu (0-100): ");
        double finall = input.nextDouble();

        // 3️⃣ Ağırlıklı ortalama hesapla
        // Örnek ağırlıklar: Ödev %20, Vize %30, Final %50
        double ortalama = (odev * 0.2) + (vize * 0.3) + (finall * 0.5);

        // 4️⃣ Harf notu belirle
        String harfNotu;
        if (ortalama >= 90) {
            harfNotu = "AA";
        } else if (ortalama >= 85) {
            harfNotu = "BA";
        } else if (ortalama >= 80) {
            harfNotu = "BB";
        } else if (ortalama >= 75) {
            harfNotu = "CB";
        } else if (ortalama >= 70) {
            harfNotu = "CC";
        } else if (ortalama >= 65) {
            harfNotu = "DC";
        } else if (ortalama >= 60) {
            harfNotu = "DD";
        } else {
            harfNotu = "FF";
        }

        // 5️⃣ Geçti / Kaldı bilgisi
        String durum = (ortalama >= 60) ? "GEÇTİ" : "KALDI";

        // 6️⃣ Detaylı rapor
        System.out.println("\n===== NOT RAPORU =====");
        System.out.println("Ad Soyad     : " + ad);
        System.out.println("Numara       : " + numara);
        System.out.println("----------------------------");
        System.out.println("Ödev Notu    : " + odev);
        System.out.println("Vize Notu    : " + vize);
        System.out.println("Final Notu   : " + finall);
        System.out.println("----------------------------");
        System.out.printf("Ortalama     : %.2f\n", ortalama);
        System.out.println("Harf Notu    : " + harfNotu);
        System.out.println("Durum        : " + durum);
        System.out.println("============================");

        input.close();
    }
          }
