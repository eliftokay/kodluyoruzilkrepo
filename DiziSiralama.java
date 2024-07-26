
import java.util.Arrays;
import java.util.Scanner;

public class DiziSiralama {
       public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Dizinin boyutunu giriniz: ");
        int size=scanner.nextInt();
        int[] list=new int[size];
        for(int i=1; i<=size; i++){
            System.out.print(i+". elementi giriniz: ");
            list[i-1]=scanner.nextInt();
        }
        Arrays.sort(list);
        Arrays.toString(list);
        System.out.println(Arrays.toString(list));
    }
}
