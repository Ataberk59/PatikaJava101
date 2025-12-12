import java.util.Scanner;

public class NotOrtalaması {
    static void main(String[] args){
        int mat, fiz, tur, kim, muz;

        Scanner input = new Scanner(System.in);
        System.out.println("Matematik notunu giriniz: ");
        mat = input.nextInt();
        if (mat < 0 || mat > 100){
            System.out.println("Geçersiz not girdiniz!");
            return;
        }

        System.out.println("Fizik notunu giriniz: ");
        fiz = input.nextInt();
        if (fiz < 0 || fiz > 100){
            System.out.println("Geçersiz not girdiniz!");
            return;
        }

        System.out.println("Türkçe notunu giriniz: ");
        tur = input.nextInt();
        if (tur < 0 || tur > 100){
            System.out.println("Geçersiz not girdiniz!");
            return;
        }

        System.out.println("Kimya notunu giriniz: ");
        kim = input.nextInt();
        if (kim < 0 || kim > 100){
            System.out.println("Geçersiz not girdiniz!");
            return;
        }

        System.out.println("Matematik notunu giriniz: ");
        muz = input.nextInt();
        if (muz < 0 || muz > 100){
            System.out.println("Geçersiz not girdiniz!");
            return;
        }

        double average = (mat + tur + fiz + kim + muz) / 5;
        if (average >= 55){
            System.out.println("Tebrikler sınıfı geçtiniz!");
        }else {
            System.out.println("Sınıfta kaldınız!");
        }
    }
}
