
import java.util.Scanner;

public class CiftSayiBulma {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Sayıyı giriniz: ");
        int input=scanner.nextInt();
        System.out.println("3'e ve 4'e bölünebilen sayılar: ");
        for(int i=1; i<=input; i++){
            if(i%12==0){
                System.out.println(i);
            }
        }
    }
 
}
