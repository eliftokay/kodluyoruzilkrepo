
import java.util.Scanner;

public class ManavKasaProgrami {
    public static void main(String[] args) {
        double armutFiyati=2.14, elmaFiyati=3.67, domatesFiyati=1.11, muzFiyati=0.95, patlicanFiyati= 5.00;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Kaç kilo armut aldınız? ");
        double armutKilo=scanner.nextDouble();
        System.out.print("Kaç kilo elma aldınız? ");
        double elmaKilo=scanner.nextDouble();
        System.out.print("Kaç kilo domates aldınız? ");
        double domatesKilo=scanner.nextDouble();
        System.out.print("Kaç kilo muz aldınız? ");
        double muzKilo=scanner.nextDouble();
        System.out.print("Kaç kilo patlıcan aldınız? ");
        double patlicanKilo=scanner.nextDouble();
        double tutar=armutFiyati*armutKilo+elmaFiyati*elmaKilo+domatesFiyati*domatesKilo+muzFiyati*muzKilo+patlicanFiyati*patlicanKilo;
        System.out.println("Toplam borcunuz: "+tutar);
    }
}
