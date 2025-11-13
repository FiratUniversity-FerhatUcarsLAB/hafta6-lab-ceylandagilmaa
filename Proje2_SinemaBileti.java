import java.util.Scanner;

public class SinemaBiletiHesaplama {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("🎬 Akıllı Sinema Bileti Fiyat Hesaplama Sistemi 🎬");
        System.out.println("--------------------------------------------------");

        // 1️⃣ Kullanıcıdan bilgiler al
        System.out.print("Yaşınızı giriniz: ");
        int yas = input.nextInt();

        System.out.print("Bilet tipi (1: Tam, 2: Öğrenci): ");
        int biletTipi = input.nextInt();

        System.out.print("Film türü (1: Normal, 2: 3D): ");
        int filmTuru = input.nextInt();

        System.out.print("Seans zamanı (1: Gündüz, 2: Gece): ");
        int seans = input.nextInt();

        // 2️⃣ Temel bilet fiyatını belirle
        double fiyat = 100.0; // Baz fiyat (örnek)

        // 3️⃣ Film türüne göre fiyat güncelle
        if (filmTuru == 2) {
            fiyat += 30; // 3D film farkı
        }

        // 4️⃣ Seans indirimi
        if (seans == 1) {
            fiyat *= 0.9; // Gündüz seansına %10 indirim
        }

        // 5️⃣ Yaş indirimi
        if (yas < 12) {
            fiyat *= 0.5; // %50 indirim (çocuk)
        } else if (yas >= 60) {
            fiyat *= 0.7; // %30 indirim (yaşlı)
        }

        // 6️⃣ Öğrenci indirimi
        if (biletTipi == 2) {
            fiyat *= 0.8; // %20 indirim
        }

        // 7️⃣ Sonuçları göster
        System.out.println("\n===== BİLET DETAYLARI =====");
        System.out.println("Yaş            : " + yas);
        System.out.println("Bilet Tipi     : " + (biletTipi == 1 ? "Tam" : "Öğrenci"));
        System.out.println("Film Türü      : " + (filmTuru == 1 ? "Normal" : "3D"));
        System.out.println("Seans Zamanı   : " + (seans == 1 ? "Gündüz" : "Gece"));
        System.out.printf("Toplam Fiyat   : %.2f TL\n", fiyat);
        System.out.println("============================");

        input.close();
    }
    }
