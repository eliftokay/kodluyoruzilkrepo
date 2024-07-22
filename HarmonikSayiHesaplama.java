
import java.util.Scanner;

public class HarmonikSayiHesaplama {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("N sayısını giriniz: ");
        int n=scanner.nextInt();
        double result=0.0, k;
        for(double i=1; i<=n; i++){
            k=1/i;
            result+=k;
        }
        System.out.println(result);
    }
}
