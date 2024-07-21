
import java.util.Scanner;

public class OrtalamaHesaplama {
    public static void main(String[] args) {
        int matematik, fizik, turkce, kimya, muzik, gecmeNotu=55, dersSayisi=0, toplam=0;
        double ortalama;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Matematik notunuzu giriniz: ");
        matematik=scanner.nextInt();
        System.out.print("Fizik notunuzu giriniz: ");
        fizik=scanner.nextInt();
        System.out.print("Türkçe notunuzu giriniz: ");
        turkce=scanner.nextInt();
        System.out.print("Kimya notunuzu giriniz: ");
        kimya=scanner.nextInt();
        System.out.print("Müzik notunuzu giriniz: ");
        muzik=scanner.nextInt();
        if(matematik<=100 && matematik>=0){
            toplam+=matematik;
            dersSayisi++;
        }
        if(fizik<=100 && fizik>=0){
            toplam+=fizik;
            dersSayisi++;
        }
        if(turkce<=100 && turkce>=0){
            toplam+=turkce;
            dersSayisi++;
        }
        if(kimya<=100 && kimya>=0){
            toplam+=kimya;
            dersSayisi++;
        }
        if(muzik<=100 && muzik>=0){
            toplam+=muzik;
            dersSayisi++;
        }
        ortalama=toplam/dersSayisi;
        if(ortalama>=gecmeNotu){
            System.out.println("Tebrikler, dersi başarıyla geçtiniz!");
        }
        else{
            System.out.println("Dersi başarıyla tamamlayamadınız.");
        }
        System.out.println("Ortalamanız: "+ortalama);
    }
    
}
