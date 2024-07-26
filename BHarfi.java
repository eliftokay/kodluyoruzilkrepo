public class BHarfi {
    public static void main(String[] args) {
        boolean[][] letterB=new boolean[7][5];
        for(int y=0; y<7; y++){
            for(int x=0; x<5; x++){
                if(x==0){
                    letterB[y][x]=true;
                }
                else if(((y==0)||(y==3)||(y==6))&&(x!=4)){
                    letterB[y][x]=true;
                }
                else if((x==4)&&(y!=0)&&(y!=3)&&(y!=6)){
                    letterB[y][x]=true;
                }
                else{
                    letterB[y][x]=false;
                }
            }
        }
        
        for(boolean[] y:letterB){
            for(boolean x: y){
                if(x){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
