
import java.util.Scanner;

public class SifreDegistirme {
    public static void main(String[] args) {
        String username="Patika", sifre="Java101", inputUsername, inputSifre;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Kullanıcı adınızı giriniz: ");
        inputUsername=scanner.nextLine();
        System.out.print("Sifrenizi giriniz: ");
        inputSifre=scanner.nextLine();
        if(username.equals(inputUsername)){
            if(sifre.equals(inputSifre)){
                System.out.println("Giriş başarılı.");
            }
            else{
                System.out.println("Şifre yanlış. Yeni bir şifre oluşturunuz: ");
                inputSifre=scanner.nextLine();
                if(inputSifre.equals(sifre)){
                    System.out.println("Yeni şifre eskisiyle aynı olamaz.");
                }
                else{
                    System.out.println("Şifreniz başarıyla değiştirildi.");
                }
            }
        }
    }
}
