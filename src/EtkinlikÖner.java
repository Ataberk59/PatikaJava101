import java.util.Scanner;

public class EtkinlikÖner {
    static void main (String[] args){
        int havaDurumu;

        Scanner input = new Scanner(System.in);
        System.out.println("Hava durumunu giriniz: ");
        havaDurumu = input.nextInt();

        if (havaDurumu < 5){
            System.out.println("Bu havada kayak yapabilirsin!");
        }else if (5 <= havaDurumu && havaDurumu <= 15) {
            System.out.println("Bu havada sinemaya gidebilirsin!");
        }else if (15 < havaDurumu && havaDurumu < 25) {
            System.out.println("Bu havada pikniğe gidebilirsin!");
        } else {
            System.out.println("Bu havada yüzmeye gidebilirsin!");
        }
    }
}
