import java.util.Scanner;

public class VücutKitleEndeksi {
    public static void main (String[] args){
        int kilo;
        double kitleEndeksi, boy;

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen boyunuzu(metre) giriniz: ");
        boy = input.nextDouble();

        Scanner input2 = new Scanner(System.in);
        System.out.println("Lütfen kilonuzu giriniz: ");
        kilo = input2.nextInt();

        kitleEndeksi = kilo / (boy * boy);
        System.out.println("Vücut kitle endeksiniz: " + kitleEndeksi);

    }

}
