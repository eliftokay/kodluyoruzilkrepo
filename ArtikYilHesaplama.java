
import java.util.Scanner;

public class ArtikYilHesaplama {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Yıl giriniz: ");
        int yil=scanner.nextInt();
        boolean artikYil;
        if (yil%100==0){
            artikYil=(yil%400==0);
        }
        else{
            artikYil=(yil%4==0);
        }
        System.out.print(artikYil);
    }
}
