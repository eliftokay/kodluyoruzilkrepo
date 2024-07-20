
import java.util.Scanner;

public class VucutKitleEndexi {
    public static void main(String[] args) {
        double kilo, boy, index;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Lütfen boyunuzu metre cinsinden giriniz: ");
        boy=scanner.nextDouble();
        System.out.print("Lütfen kilonuzu giriniz: ");
        kilo=scanner.nextDouble();
        index=kilo/boy/boy;
        System.out.println("Vücut kitle indexiniz: "+index);
    }
}
