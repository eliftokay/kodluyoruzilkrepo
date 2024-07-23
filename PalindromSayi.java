import java.util.Scanner;

public class PalindromSayi {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Sayıyı giriniz: ");
        int input=scanner.nextInt();
        System.out.println(isPalindrome(input));
    }
    static boolean isPalindrome(int num){
        if(num<10){
            return true;
        }
        else{
            if(num%10==firstDigit(num)){
                return true;
            }
            else{
                return isPalindrome(num-(firstDigit(num)*digitNumber(num))-(num%10));
            }
        }
    }
    static int firstDigit(int num){
        while(num/10!=0){
            num/=10;
        }
        return num;
    }
    
    static int digitNumber(int num){
        int count=0;
        do{
            num/=10;
            count++;
        }
        while(num/10!=0);
        int result=1;
        for(int i=1; i<count; i++){
            result*=10;
        }
        return result;
    }
}
