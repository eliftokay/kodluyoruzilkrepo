public class Elmas {
    public static void main(String[] args) {
        for(int a=1; a<=9; a+=2){
            int k=(9-a)/2;
            for(int j=1; j<=k; ++j){
                System.out.print(" ");
            }
            for(int j=1; j<=a; ++j){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int a=7; a>0; a-=2){
            int k=(9-a)/2;
            for(int j=1; j<=k; ++j){
                System.out.print(" ");
            }
            for (int j=1; j<=a; ++j){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
