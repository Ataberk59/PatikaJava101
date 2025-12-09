import java.util.Scanner;

public class DaireAlanı {
    public static void main (String[] args){
        int r, alfa;
        double alan;
        Scanner input = new Scanner(System.in);
        System.out.println("Dairenizin yarı çapını giriniz: ");
        r = input.nextInt();

        Scanner input2 = new Scanner(System.in);
        System.out.println("Daire diliminizin açısını giriniz: ");
        alfa = input2.nextInt();

        alan = (3.14 * (r * r) * alfa) / 360;
        System.out.println("Daire diliminizin alanı: " + alan);
    }
}
