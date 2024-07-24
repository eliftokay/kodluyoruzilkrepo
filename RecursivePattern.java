
import java.util.Scanner;

public class RecursivePattern {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sayıyı giriniz: ");
        int input = scanner.nextInt();
        pattern(input, true , 0);
    }
    static void pattern(int input, boolean switching, int count){
        System.out.print(input+" ");
        if(switching){
            input-=5;
            count++;
            if(input>=0){
                pattern(input, switching, count);
            }
            else{
                pattern(input, false, count);
            }
        }
        
        else{
            if(count!=0){
                count--;
                input+=5;
                pattern(input, false, count);
            }
        }
    }
    
}
