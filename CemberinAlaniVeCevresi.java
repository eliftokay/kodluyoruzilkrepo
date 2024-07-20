import java.util.Scanner;

public class CemberinAlaniVeCevresi {
    public static void main(String[] args) {
        
    
    double cap, yaricap, alan, cevre;
    Scanner scanner=new Scanner(System.in);
    System.out.print("Çemberin çapını giriniz: ");
    cap=scanner.nextDouble();
    yaricap=cap/2;
    alan=yaricap*yaricap*Math.PI;
    cevre=cap*Math.PI;
    System.out.println("Çemberin çevresi: "+cevre);
    System.out.println("Çemberin alanı: "+alan);
    }
}
