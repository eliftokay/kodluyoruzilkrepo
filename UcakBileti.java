
import java.util.Scanner;

public class UcakBileti {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int mesafe, yas, yolculukTipi;
        double mesafeBasiUcret = 0.10;
        System.out.print("Yaşınızı giriniz: ");
        yas = scanner.nextInt();
        System.out.print("Uçuş mesafesini giriniz: ");
        mesafe = scanner.nextInt();
        System.out.print("Uçuş tipini tek yön ise 1, çift yön ise 2 olacak şekilde giriniz: ");
        int k = scanner.nextInt();
        if (k == 1 || k == 2) {
            yolculukTipi = k;
            double tutar = mesafe * mesafeBasiUcret;
            if (yas < 12) {
                tutar *= 0.5;
            } 
            else if (yas <= 24 && yas >= 12) {
                tutar *= 0.9;
            } 
            else if (yas > 65) {
                tutar *= 0.7;
            }

            if (yolculukTipi == 2) {
                tutar *= 0.8;
            }
            System.out.println("Toplam borcunuz: "+tutar);
        } 
        else {
            System.out.println("Lütfen geçerli bir yolculuk tipi giriniz.");
        }

    }

}
