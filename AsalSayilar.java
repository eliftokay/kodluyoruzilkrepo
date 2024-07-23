public class AsalSayilar {
    public static void main(String[] args) {
        for(int i=2; i<=100; i++){
            boolean isPrime=true;
            double k=Math.sqrt(i);
            for(int j=1; j<=k; ++j){
                if(i%j==0){
                    isPrime=false;
                }
            }
            if(isPrime){
                System.out.print(i+" ");
            }
        }
    }
}
