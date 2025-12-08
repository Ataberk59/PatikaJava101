import java.util.Scanner;

public class kdvHesaplama {
    public void main (String[] args){
    double tutar;
    double kdvliÜcret;
    double kdv;
    Scanner input = new Scanner(System.in);
        System.out.println("Ücret tutarını giriniz: ");
        tutar = input.nextDouble();
        System.out.println("Girilen değer: " + tutar);
        if((0 < tutar) && (tutar <= 1000) ){
            kdv = tutar * 0.18;
            kdvliÜcret = tutar + kdv;
            System.out.println("KDV 'li tutar: " + kdvliÜcret);
        }else if (1000 < tutar){
            kdv = tutar * 0.08;
            kdvliÜcret = (tutar + kdv);
            System.out.println("KDV 'li tutar: " + kdvliÜcret);
        }else {
            System.out.println("Pozitif değer giriniz!");
        }
    }
}
