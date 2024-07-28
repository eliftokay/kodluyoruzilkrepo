import java.util.Arrays;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner=new Scanner(System.in);
        int secenek=0;
        while(secenek!=2){
        System.out.print("Mayin tarlasina hoş geldiniz! Oyunun kurallarini ogrenmek icin 1, oyuna baslamak icin 2'yi tuslayin.");
            secenek=scanner.nextInt();
            if(secenek==1){
                System.out.println("Mayin tarlasi, sizin sececeginiz boyutlarda olusturulan bir tahtadaki gizlenmis mayinlari bulmaya calistiginiz bir oyundur. Tahtadan sectiginiz kutucuk mayin cikarsa oyunu kaybedersiniz. Eger mayin yoksa, kutucukta cevredeki /(Capraz koseler dahil/) bombalarin sayisi goruntulenir. Bol Sans!");
            } 
            else if(secenek!=2){
                System.out.println("Lutfen gecerli bir deger giriniz.");
            }
        }
        secenek=0;
        int satir=0, sutun=0;
            System.out.println("Lutfen satir ve sutun boyutlarini en az 2 birim olacak sekilde giriniz.");
            while(secenek==0){
            System.out.print("Satir boyutu:");
            satir=scanner.nextInt();
                if(satir<2){
                System.out.print("Lutfen en az 2 boyutunda bir deger giriniz.");
                }
                else{
                    break;
                }
            }
            while(secenek==0){
                System.out.print("Sutun boyutu:");
                sutun=scanner.nextInt();
                    if(sutun<2){
                    System.out.print("Lutfen en az 2 boyutunda bir deger giriniz.");
                    }
                    else{
                        secenek=1;
                    }
            }
            Display player=new Display(satir, sutun);
            Board board=new Board(satir, sutun);
            int a, b, sonuc, isaret;
            boolean isWon=true;
            int numOfBombsLeft=satir*sutun/4;
            while(numOfBombsLeft>0){
                System.out.println("===============");
                player.display();
                System.out.print("Satir girin: ");
                a=scanner.nextInt();
                System.out.print("Sutun girin: ");
                b=scanner.nextInt();
                System.out.print("Acmak icin 1, isaretlemek icin 2 secin: ");
                isaret=scanner.nextInt();
                if((a>satir)||(b>sutun)||(a<1)||(b<1)||((isaret!=1)&&(isaret!=2))){
                    System.out.println("Lutfen gecerli bir kare/isaret giriniz.");
                    continue;
                }
                else if(player.board[a-1][b-1]!=-1){
                    System.out.println("Daha once girmediginiz bir kare girin.");
                    continue;
                }
                sonuc=board.numberOfNeigbours(a,b);
                if(sonuc==-1){
                    if(isaret==2){
                        System.out.println("Tebrikler! Bombalardan birini buldunuz.");
                        numOfBombsLeft--;
                        player.mark(a,b);
                        continue;
                    }
                    else{
                        isWon=false;
                        break;
                    }
                }
                else{
                    player.open(a,b,sonuc);
                }
                
            }
        if(isWon){
            System.out.println("Tebrikler, kazandiniz!");
        }
        else{
            System.out.println("Maalesef kaybettiniz.");
        }
    }
}
