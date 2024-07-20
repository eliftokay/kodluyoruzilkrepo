import java.util.Scanner;

public class HipotenusBulma {
    public static void main(String[] args) {
        double a, b, c;
        Scanner scanner=new Scanner(System.in);
        System.out.print("İlk kenarın uzunluğunu giriniz: ");
        a=scanner.nextDouble();
        System.out.print("İkinci kenarın uzunluğunu giriniz: ");
        b=scanner.nextDouble();
        c=Math.sqrt(a*a+b*b);
        System.out.println("Hipotenüsün uzunluğu: "+c);
    }
}
