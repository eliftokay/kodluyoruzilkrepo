import java.util.Arrays;
import java.util.Scanner;

public class ListedenKucukVeBuyukBulma {
    public static void main(String[] args) {
        int[] list= {15,12,788,1,-1,-778,2,0};
        Scanner scanner=new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int input=scanner.nextInt();
        int[] secondArray=Arrays.copyOf(list, list.length+1);
        secondArray[list.length]=input;
        Arrays.sort(secondArray);
        int a=Arrays.binarySearch(secondArray, input);
        System.out.println("Girilen sayıdan küçük en yakın sayı : "+secondArray[a-1]);
        System.out.println("Girilen sayıdan büyük en yakın sayı : "+secondArray[a+1]);
    }
}
