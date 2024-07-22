
import java.util.Scanner;

public class DordeBolunenlerToplami {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int input=0, toplam=0;
        do{
            System.out.print("Bir sayı giriniz: ");
            input=scanner.nextInt();
            if(input%4==0){
                toplam+=input;
            }
        }
        while(0<input);
        System.out.println("Toplam: "+toplam);
    }
}
