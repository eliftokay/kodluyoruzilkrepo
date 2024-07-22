
import java.util.Scanner;

public class BurcBulmaProgrami {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int yil, gun, ay, k;
        System.out.println("Hangi yil dogdun:");
        k = scanner.nextInt();
        System.out.println("Kacinci ayda dogdun:");
        ay = scanner.nextInt();
        System.out.println("Hangi gun dogdun:");
        gun = scanner.nextInt();

        if (k > 1400) {
            yil = k;
        } else if (k > 23) {
            yil = k + 1900;
        } else {
            yil = k + 2000;
        }

        if (ay < 11) {
            System.out.println("Yasiniz: " + (2023 - yil));
        } else if (ay == 12) {
            System.out.println("Yasiniz: " + (2022 - yil));
        } else if (gun <= 27) {
            System.out.println("Yasiniz: " + (2023 - yil));
        } else {
            System.out.println("Yasiniz:" + (2022 - yil));
        }
        int ay2;
        switch (ay) {
            case 1:
                ay2 = 0;
                if (gun < 22) {
                    System.out.println("Burcunuz oglak.");
                } else {
                    System.out.println("Burcunuz kova.");
                }
                break;
            case 2:
                ay2 = 31;
                if (gun < 19) {
                    System.out.println("Burcunuz kova.");
                } else {
                    System.out.println("Burcunuz balik.");
                }
                break;
            case 3:
                ay2 = 59;
                if (gun < 20) {
                    System.out.println("Burcunuz balik.");
                } else {
                    System.out.println("Burcunuz koc.");
                }
                break;
            case 4:
                ay2 = 90;
                if (gun < 20) {
                    System.out.println("Burcunuz koc.");
                } else {
                    System.out.println("Burcunuz boga.");
                }
                break;
            case 5:
                ay2 = 120;
                if (gun < 22) {
                    System.out.println("Burcunuz boga.");
                } else {
                    System.out.println("Burcunuz ikizler.");
                }
                break;
            case 6:
                ay2 = 151;
                if (gun < 22) {
                    System.out.println("Burcunuz ikizler.");
                } else {
                    System.out.println("Burcunuz yengec.");
                }
                break;
            case 7:
                ay2 = 181;
                if (gun < 22) {
                    System.out.println("Burcunuz yengec.");
                } else {
                    System.out.println("Burcunuz aslan.");
                }
                break;
            case 8:
                ay2 = 212;
                if (gun < 22) {
                    System.out.println("Burcunuz aslan.");
                } else {
                    System.out.println("Burcunuz basak.");
                }
                break;
            case 9:
                ay2 = 243;
                if (gun < 22) {
                    System.out.println("Burcunuz basak.");
                } else {
                    System.out.println("Burcunuz terazi.");
                }
                break;
            case 10:
                ay2 = 273;
                if (gun < 22) {
                    System.out.println("Burcunuz terazi.");
                } else {
                    System.out.println("Burcunuz akrep.");
                }
                break;
            case 11:
                ay2 = 304;
                if (gun < 22) {
                    System.out.println("Burcunuz akrep.");
                } else {
                    System.out.println("Burcunuz yay.");
                }
                break;
            case 12:
                ay2 = 334;
                if (gun < 22) {
                    System.out.println("Burcunuz yay.");
                } else {
                    System.out.println("Burcunuz oglak.");
                }
                break;
            default:
                System.out.println("Boyle bir ay yok.");
                ay2 = 0;
                break;
        }
        System.out.println("\n");
        yil = yil - 1900;
        int gecen = yil + ay2 + gun;
        yil = yil / 4;
        gecen = gecen + yil;
        gecen = gecen % 7;

        switch (gecen) {

            case 0:
                System.out.println("Pazar gunu dogdunuz.");
                break;

            case 1:
                System.out.println("Pazartesi gunu dogdunuz.");
                break;

            case 2:
                System.out.println("Sali gunu dogdunuz.");
                break;

            case 3:
                System.out.println("Carsamba gunu dogdunuz.");
                break;

            case 4:
                System.out.println("Persembe gunu dogdunuz.");
                break;

            case 5:
                System.out.println("Cuma gunu dogdunuz.");
                break;

            case 6:
                System.out.println("Cumartesi gunu dogdunuz.");
                break;

            default:
                break;
        }
    }

}
