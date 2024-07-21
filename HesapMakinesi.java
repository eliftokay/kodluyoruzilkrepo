
import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        double a, b, sonuc;
        int secenek;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Hangi işlemi yapmak istiyorsunuz? + için 1, - için 2, * için 3, / için 4 operatörlerinden birini seçiniz.");
        secenek=scanner.nextInt();
        System.out.print("İlk sayıyı giriniz:");
        a=scanner.nextDouble();
        System.out.print("İkinci sayıyı giriniz:");
        b=scanner.nextDouble();
        switch(secenek){
            case 1:
                sonuc=a+b;
                System.out.println(a+"+"+b+"="+sonuc);
                break;
            case 2:
                sonuc=a-b;
                System.out.println(a+"-"+b+"="+sonuc);
                break;
            case 3:
                sonuc=a*b;
                System.out.println(a+"*"+b+"="+sonuc);
                break;
            case 4:
                if(b==0){
                    System.out.println("Sıfıra bölünemez.");
                    break;
                }
                sonuc=a/b;
                System.out.println(a+"/"+b+"="+sonuc);
                break;
            default:
                System.out.println("Lütfen geçerli bir operatör giriniz.");
        }
    }
    
}
