
import java.util.Scanner;

public class SayiSiralama {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double a, b, c;
        System.out.print("Birinci sayıyı giriniz: ");
        a=scanner.nextDouble();
        System.out.print("İkinci sayıyı giriniz: ");
        b=scanner.nextDouble();
        System.out.print("Üçüncü sayıyı giriniz: ");
        c=scanner.nextDouble();
        if(a<b && a<c){
         if(b<c){
             System.out.println("a<b<c");
         }
         else{
             System.out.println("a<c<b");
         }
        }
        if(b<a && b<c){
         if(a<c){
             System.out.println("b<a<c");
         }
         else{
             System.out.println("b<c<a");
         }
        }
        if(c<b && c<a){
         if(b<a){
             System.out.println("c<b<a");
         }
         else{
             System.out.println("c<a<b");
         }
        }
    }
}
