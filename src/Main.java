import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String username, password, newPassword, logic;


        Scanner input = new Scanner(System.in);

        System.out.print("Kullanıcı Adı: ");
        username = input.nextLine();

        System.out.print("Şifre: ");
        password = input.nextLine();

        if ((username.equals("patika") && password.equals("java123"))) {
            System.out.println("Giriş Başarılı, Hoşgeldiniz!");
        } else {
            System.out.println("Giriş Başarısız...");
            System.out.print("Şifreyi sıfırlamak için (Y) sıfırlamamak için (N) giriniz: ");
            logic = input.nextLine();
            switch (logic){
                case "Y":
                    System.out.print("Yeni Şifre : ");
                    newPassword = input.nextLine();
                    if(newPassword.equals("java123")){
                        System.out.println("Şifre oluşturma Başarısız...");
                    }else{
                        password = newPassword;
                        System.out.println("Yeni Şifre Başarıyla Oluşturuldu...");
                    }
                    break;
                case "N":
                    System.out.println("Tekrar Deneyiniz...");
                    break;

            }


        }
    }
}