
import java.util.Scanner;

public class RecursiveExponential {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Tabanı giriniz: ");
        int base=scanner.nextInt();
        System.out.print("Üssü giriniz: ");
        int exp=scanner.nextInt();
        System.out.println(exponential(base, exp));
    }
    
    static int exponential(int base, int exp){
        if(exp==0){
            return 1;
        }
        else if(exp==1){
            return base;
        }
        else{
            exp--;
            return (base*(exponential(base, exp)));
        }
    }
    
}
