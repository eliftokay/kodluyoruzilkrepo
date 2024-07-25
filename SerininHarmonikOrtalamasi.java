public class SerininHarmonikOrtalamasi {
    public static void main(String[] args) {
        int[] numbers={1,2,3,4,5};
        double sum=0, k;
        for (int i:numbers){
            k=(1.0/i);
            sum+=k;
        }
        double result=numbers.length/sum;
        System.out.println(result);
        
    }
}
