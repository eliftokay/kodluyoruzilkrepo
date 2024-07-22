import java.util.Scanner;

public class KombinasyonHesaplama {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num1, num2, kombinasyon=1;
        System.out.println("Tüm elemanların sayısını yazınız: ");
        num1=scanner.nextInt();
        int temp=num1;
        System.out.println("Grupta istediğiniz eleman sayısını yazınız: ");
        num2=scanner.nextInt();
        for(int i=1; i<=num2; i++){
            kombinasyon*=temp;
            temp--;
        }
        temp=num2;
        for(int i=1; i<=num2; i++){
            kombinasyon/=temp;
            temp--;
        }
        System.out.println(kombinasyon);
    }
}
