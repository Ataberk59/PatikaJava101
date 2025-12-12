import java.util.Scanner;

public class KullanıcıGirişi {
    public static void main (String[] args){
        String userName, password;

        Scanner input = new Scanner(System.in);
        System.out.println("Kullanıcı adını giriniz: ");
        userName = input.nextLine();

        System.out.println("Şifrenizi giriniz: ");
        password = input.nextLine();

        if (userName.equals("Patika") && password.equals("java123")){
            System.out.println("Başarılı giriş");
        }else {
            System.out.println("Şifreniz yanlış! Şifrenizi sırılamak ister misiniz? \n1-) Evet\n2-) Hayır");
            int cevap = input.nextInt();
            if(cevap == 1){
                System.out.println("Yeni şifre giriniz: ");
                password = input.nextLine();
                input.nextLine();
                if (password.equals("java123")){
                    System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                }else {
                    System.out.println("Şifre oluşturuldu");
                }
            }if (cevap == 2){
                System.out.println("Doğru şifrenizi giriniz!");
            }else{
                System.out.println("Sayfayı yenileyiniz!");
            }
        }
    }
}
