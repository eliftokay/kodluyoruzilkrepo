import java.util.Scanner;

public class Taksimetre {
    public static void main(String[] args) {
        double gidilenMesafe, acilisUcreti=10, minimumTutar=20, kmFiyati=2.20;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Gidilen yolun uzunluğunu giriniz: ");
        gidilenMesafe=scanner.nextDouble();
        double toplamTutar=gidilenMesafe*kmFiyati+acilisUcreti;
        if(toplamTutar<minimumTutar){
            System.out.println("Toplam burcunuz "+minimumTutar+" TL.");
        }
        else{
            System.out.println("Toplam burcunuz "+toplamTutar+" TL.");
        }
    }
}
