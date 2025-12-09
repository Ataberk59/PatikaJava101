import java.util.Scanner;

public class ManavTutarı {
    public static void main (String[] args){
        double armutFiyat = 2.14;
        double elmaFiyat = 3.64;
        double domatesFiyat = 1.11;
        double muzFiyat = 0.95;
        double patlicanFiyat = 5.00;
        double toplam;
        int armut, elma, domates, muz, patlican;

        Scanner input = new Scanner(System.in);
        System.out.println("Kaç kilo Armut aldınız?");
        armut = input.nextInt();

        Scanner input2 = new Scanner(System.in);
        System.out.println("Kaç kilo Elma aldınız?");
        elma = input2.nextInt();

        Scanner input3 = new Scanner(System.in);
        System.out.println("Kaç kilo Domates aldınız?");
        domates = input3.nextInt();

        Scanner input4 = new Scanner(System.in);
        System.out.println("Kaç kilo Muz aldınız?");
        muz = input4.nextInt();

        Scanner input5 = new Scanner(System.in);
        System.out.println("Kaç kilo Patlıcan aldınız?");
        patlican = input5.nextInt();
        toplam = ((armutFiyat * armut) + (elmaFiyat * elma) + (domatesFiyat * domates) + (muzFiyat * muz) + (patlicanFiyat * patlican));
        System.out.println("Ödemeniz gereken toplam tutar: " + toplam);
    }
}
