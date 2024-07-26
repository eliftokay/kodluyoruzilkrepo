import java.util.Arrays;

public class TekrarSayilari {
    public static void main(String[] args) {
        int[] numbers={10, 20, 20, 10, 10, 20, 5, 20};
        int[] copy=Arrays.copyOf(numbers, numbers.length);
        Arrays.sort(copy);
        int count=1;
        int current=0;
        while(copy[current]!=copy[copy.length-1]){
            if(copy[current+1]==copy[current]){
                count++;
                current++;
            }
            else{
                if(count!=1){
                System.out.println(copy[current]+": "+count+" kez tekrar ediyor.");
                }
                count=1;
                current++;
            }
        }
        if(copy.length!=current+1){
        System.out.println(copy[copy.length-1]+": "+((copy.length)-current)+" kez tekrar ediyor.");
        }
        
    }
}
