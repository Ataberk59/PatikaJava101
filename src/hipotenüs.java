import java.util.Scanner;
public class hipotenüs {
    public void main(String[] args){
        int birinciKenar, ikinciKenar;
        double hipotenüsKenar;
        Scanner input = new Scanner(System.in);
        System.out.println("Üçgenin birinci kenar uzunluğunu giriniz: ");
        birinciKenar = input.nextInt();
        System.out.println("Üçgenin ikinci kenarını giriniz: ");
        ikinciKenar = input.nextInt();
        hipotenüsKenar = Math.sqrt((birinciKenar*birinciKenar)+ (ikinciKenar*ikinciKenar));
        System.out.println("Dik üçgenin Hipotenüsü: " + hipotenüsKenar);

    }
}
