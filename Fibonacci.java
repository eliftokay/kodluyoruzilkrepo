import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Fibonacci serisinin ilk kaç elemanını istiyorsunuz? ");
        int input= scanner.nextInt();
        int a=0, b=1, c=1;
        for(int i=1; i<=input; i++){
            System.out.println(a+"+"+b+"="+c);
            a=b;
            b=c;
            c=a+b;
        }
    }
}
