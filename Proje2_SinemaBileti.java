import java.util.Scanner;

public class SinemaBileti {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Film listesi
        String[] filmler = {"1- Avatar", "2- Inception", "3- Interstellar"};
        String[] seanslar = {"1- 12:00", "2- 15:00", "3- 18:00", "4- 21:00"};

        System.out.println("=== SİNEMA BİLET SİSTEMİ ===");
        
        // Film seçimi
        System.out.println("\nFilmler:");
        for (String film : filmler) {
            System.out.println(film);
        }
        System.out.print("Film seçiniz (1-3): ");
        int filmSecim = scanner.nextInt();

        // Seans seçimi
        System.out.println("\nSeanslar:");
        for (String seans : seanslar) {
            System.out.println(seans);
        }
        System.out.print("Seans seçiniz (1-4): ");
        int seansSecim = scanner.nextInt();

        // Bilet tipi seçimi
        System.out.println("\nBilet Tipi:");
        System.out.println("1- Tam (120 TL)");
        System.out.println("2- Öğrenci (90 TL)");
        System.out.print("Seçim: ");
        int biletTipi = scanner.nextInt();

        double fiyat = 0;

        if (biletTipi == 1) {
            fiyat = 120;
        } else if (biletTipi == 2) {
            fiyat = 90;
        } else {
            System.out.println("Geçersiz bilet tipi!");
            return;
        }

        // Sonuç
        System.out.println("\n=== BİLET ÖZETİ ===");
        System.out.println("Film: " + filmler[filmSecim - 1].substring(3));
        System.out.println("Seans: " + seanslar[seansSecim - 1].substring(3));
        System.out.println("Bilet Tipi: " + (biletTipi == 1 ? "Tam" : "Öğrenci"));
        System.out.println("Fiyat: " + fiyat + " TL");

        System.out.println("\nİyi seyirler!");
    }
                                             }
