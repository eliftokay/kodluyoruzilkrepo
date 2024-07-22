
import java.util.Scanner;

public class UsluSayiHesaplama {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int taban,us;
        System.out.print("Tabanı giriniz: ");
        taban=scanner.nextInt();
        System.out.print("Üssü giriniz: ");
        us=scanner.nextInt();
        int sonuc=1;
        for(int i=1; i<=us; i++){
            sonuc*=taban;
        }
        System.out.println(sonuc);
    }
}
