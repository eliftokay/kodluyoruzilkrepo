import java.util.Scanner;

public class EtkinlikOnerisi {
    public static void main(String[] args) {
        double sicaklik;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Hava sıcaklığını giriniz: ");
        sicaklik=scanner.nextDouble();
        if(sicaklik<5){
            System.out.println("Kayak yapmaya gidebilirsiniz.");
        }
        if(sicaklik>=5 && sicaklik<=15){
            System.out.println("Sinemaya gidebilirsiniz.");
        }
        if(sicaklik>=10 && sicaklik<=25){
            System.out.println("Piknik yapmaya gidebilirsiniz.");
        }
        if(sicaklik>25){
            System.out.println("Yüzmeye gidebilirsiniz.");
        }
    }
}