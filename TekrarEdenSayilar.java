import java.util.Arrays;

public class TekrarEdenSayilar {
    public static void main(String[] args) {
        int[] numbers={3, 7, 2, 8, 2, 5, 7, 9, 3, 10, 8};
        int[] copy=Arrays.copyOf(numbers, numbers.length);
        Arrays.sort(copy);
        int lastPrinted=copy[0]-1;
            for(int i=1; i<copy.length-2; i++){
                if((copy[i-1]==copy[i]||copy[i+1]==copy[i])&&(copy[i]%2==0)&&copy[i]!=lastPrinted){
                    lastPrinted=copy[i];
                    System.out.print(lastPrinted+" ");
                }
            }
        }
    }