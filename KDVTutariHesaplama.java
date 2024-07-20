import java.util.Scanner;

public class KDVTutariHesaplama {
    public static void main(String[] args) {
        double tutar, kdvOrani=0.18;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Ürün tutarını giriniz:");
        tutar=scanner.nextDouble();
        System.out.println("Ürün tutarı: "+tutar);
        System.out.println("KDV Oranı: "+kdvOrani);
        System.out.println("KDV Miktarı: "+tutar*kdvOrani);
        System.out.println("Toplam fiyat: "+tutar*(kdvOrani+1));
    }   
}
