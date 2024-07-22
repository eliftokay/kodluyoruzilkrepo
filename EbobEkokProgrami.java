import java.util.Scanner;

public class EbobEkokProgrami {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("İlk sayıyı giriniz: ");
        int num1=scanner.nextInt();
        System.out.print("İkinci sayıyı giriniz: ");
        int num2=scanner.nextInt();
        int count=1, ebob=1;
        while(count<=num1){
            if((num1%count==0)&&(num2%count==0)){
                ebob=count;
            }
            count++;
        }
        System.out.println("Ebob: "+ebob);
        System.out.println("Ekok: "+ (num1*num2/ebob));
    }
}
