import java.util.Scanner;

public class RestoranSiparis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Menü
        String[] yemekler = {
            "1- Kebap (150 TL)",
            "2- Pizza (120 TL)",
            "3- Hamburger (90 TL)",
            "4- Makarna (70 TL)"
        };

        int[] fiyatlar = {150, 120, 90, 70};

        System.out.println("=== RESTORAN SİPARİŞ SİSTEMİ ===");

        // Menü Yazdırma
        System.out.println("\nMenü:");
        for (String yemek : yemekler) {
            System.out.println(yemek);
        }

        // Yemek seçimi
        System.out.print("\nSipariş etmek istediğiniz yemeği seçin (1-4): ");
        int secim = scanner.nextInt();

        if (secim < 1 || secim > 4) {
            System.out.println("Geçersiz seçim!");
            return;
        }

        // Adet
        System.out.print("Kaç adet istiyorsunuz?: ");
        int adet = scanner.nextInt();

        if (adet <= 0) {
            System.out.println("Adet 0 olamaz!");
            return;
        }

        // Toplam hesaplama
        int toplam = fiyatlar[secim - 1] * adet;

        System.out.println("\n=== SİPARİŞ ÖZETİ ===");
        System.out.println("Yemek: " + yemekler[secim - 1].substring(3));
        System.out.println("Adet: " + adet);
        System.out.println("Toplam Fiyat: " + toplam + " TL");
        System.out.println("\nSiparişiniz alınmıştır. Afiyet olsun!");

        scanner.close();
    }
          }
