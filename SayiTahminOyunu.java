
import java.util.Scanner;
import java.math.*;

public class SayiTahminOyunu {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Zorluk seçiniz. /(1 ile 3 arası/) ");
        int n=scanner.nextInt();
        double num;
        num = Math.random();
        for(int i=1;i<=n;i++){
            num*=10;
        }
        num=Math.round(num);
        int count=1, guess;
        do{
            System.out.print(count+". tahmininizi giriniz: ");
            guess=scanner.nextInt();
            count++;
            if(guess>num){
                System.out.println("Daha küçük bir sayı tahmin edin.");
            }
            else if(guess<num){
                System.out.println("Daha büyük bir sayı tahmin edin.");
            }
        }
        while(guess!=num);
        System.out.println("Tebrikler! "+(count-1)+". tahmininizde bildiniz.");
        
    }
}
