import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Kelimeyi giriniz: ");
        String str=scanner.nextLine();
        boolean print=true;
        for(int i=0, j=(str.length()-1); i<j; i++, j--){
            if(str.charAt(i)!=str.charAt(j)){
                System.out.println("Not polindrome.");
                print=false;
                break;
            }
        }
        if(print){
            System.out.println("Is a palindrome.");
        }
    }
}

