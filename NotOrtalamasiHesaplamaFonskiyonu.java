import java.util.Scanner;

 public static void main(String[] args) {
        
        int tarih;
        int muzik;
        int matematik;
        int ingilizce;
        int fizik;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Tarih notunuzu giriniz:");
        tarih=scanner.nextInt();
        System.out.print("\nMüzik notunuzu giriniz:");
        muzik=scanner.nextInt();
        System.out.print("\nMatematik notunuzu giriniz:");
        matematik=scanner.nextInt();
        System.out.print("\nİngilizce notunuzu giriniz:");
        ingilizce=scanner.nextInt();
        System.out.print("\nFizik notunuzu giriniz:");
        fizik=scanner.nextInt();
        int ortalama=(tarih+muzik+matematik+ingilizce+fizik)/5;
        System.out.print("\nOrtalamanız "+ortalama);
        if(ortalama>=60){
            System.out.print(". Dersi başarıyla geçtiniz!");
        }
        else{
            System.out.print(". Dersi başarıyla tamamlayamadınız.");
        }
        
    }
   