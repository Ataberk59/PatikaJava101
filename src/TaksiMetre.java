import java.util.Scanner;

public class TaksiMetre {
    public void main (String[] args){
    double kmÜcreti = 2.20;
    double ücret;
    int taksiMetreAcilis = 10;
    int km;
    Scanner input = new Scanner(System.in);
        System.out.println("Gideceğiniz mesafeyi giriniz: ");
        km = input.nextInt();
        ücret = (km * kmÜcreti) + 10;
        if (ücret > 20){
            System.out.println("Ödemeniz gereken tutar: " + ücret);
        }else {
            System.out.println("Ödemeniz gereken tutar 20 liradır.");
        }
    }
}
