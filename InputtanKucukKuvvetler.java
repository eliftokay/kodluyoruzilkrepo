
import java.util.Scanner;

public class InputtanKucukKuvvetler {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int input=scanner.nextInt();
        for(int a=4; a<=5; a++){
            System.out.println(input+"ten küçük "+a+"n kuvvetleri: ");
            for(int i=1; i<=input; i*=a){
                if(input>i){
                    System.out.println(i);
                }
            }
        }
    }
}
