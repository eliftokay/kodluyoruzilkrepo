
import java.util.Scanner;

public class BasamakSayilariToplami {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int input=scanner.nextInt();
        int toplam=0, temp;
        while(input>0){
            temp=input%10;
            toplam+=temp;
            input=(input-temp)/10;
        }
        System.out.println(toplam);
    }
}
