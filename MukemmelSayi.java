import java.util.Scanner;

public class MukemmelSayi {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int input=scanner.nextInt();
        int toplam=0;
        for(int i=1; i<input;i++){
            if(input%i==0){
                toplam+=i;
            }
        }
        if(toplam==input){
            System.out.println(input+" bir mükemmel sayıdır.");
        }
        else{
            System.out.println(input+" bir mükemmel sayı değildir.");
        }
    }
   
}
