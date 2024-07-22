
import java.util.Scanner;

public class EnBuyukEnKucuk {
    public static void main(String[] args){
        int min, max, temp;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Kaç tane sayı gireceksiniz? ");
        int k=scanner.nextInt();
        System.out.print("1. sayıyı giriniz: ");
        min=scanner.nextInt();
        System.out.print("2. sayıyı giriniz: ");
        max=scanner.nextInt();
        if(min>max){
            temp=max;
            max=min;
            min=temp;
        }
        for(int a=3; a<=k; a++){
            System.out.print(a+". sayıyı giriniz: ");
            temp=scanner.nextInt();
            if(temp<min){
                min=temp;
            }
            if(temp>max){
                max=temp;
            }
        }
        System.out.println("En büyük sayı "+ max+" ve en küçük sayı "+min);
    }
}
