
import java.util.Scanner;

public class TersUcgen {
    public static void main(String[] args) {
        
    Scanner scanner=new Scanner(System.in);
    System.out.print("Satır sayısını giriniz: ");
    int input=scanner.nextInt();
    for(int a=input; a>0; a--){
    for(int i=1; i<=a; i++){
        System.out.print("*");
    }
    System.out.println();
    }
}
}
