import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        String username, password,  newPassword;
        int select;

        Scanner input = new Scanner(System.in);

        System.out.println("Kullanıcı Adınız : ");
        username = input.nextLine();

        System.out.println("Şifreniz : ");
        password = input.nextLine();

        if(username.equals("patika") && password.equals("java123")){
            System.out.println("Giriş Yaptınız !");
        }else {
            System.out.println("Bilgileriniz yanlış !");
            System.out.println("Şifrenizi sıfırlamak isterseniz 0'a  istemezseniz 1'e basınız !");

            select = input.nextInt();
            switch (select) {
                case 0:
                    System.out.println("Yeni şifrenizi giriniz.");

                    newPassword = input.nextLine();
                    if(newPassword.equals(password) ){
                        System.out.println("Eski şifreyi girdiniz yeni şifre belirleyiniz");
                    }else {
                        System.out.println("Şifreniz oluşturuldu.");
                    }
                    break;
                case 1:
                    break;
            }
        }
    }
}