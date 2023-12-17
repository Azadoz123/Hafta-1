import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        String username, password;
        Scanner input = new Scanner(System.in);
        int right = 3;
        int balance = 1500;
        int select , price;

        while (right > 0){
            System.out.println("Kullanıcı adı giriniz : ");
            username = input.nextLine();
            System.out.println("Parolanız : ");
            password = input.nextLine();
            if(username.equals("patika") && password.equals("dev123")){
                System.out.println("Merhaba xxx Bankasına Hoşgeldiniz.");
              do {
                  System.out.println("Lütfen yapmak istediğniz işlemi seçiniz.");
                  System.out.println(
                          "1- Para yatırma\n" +
                                  "2- Para çekme\n" +
                                  "3- Bakiye sorgulama\n" +
                                  "4- Çıkış yap");
                  select = input.nextInt();
                     switch (select) {
                         case 1:
                             System.out.println("Para miktarı : ");
                             price = input.nextInt();
                             balance += price;
                             break;
                         case 2:
                             System.out.println("Para miktarı : ");
                             price = input.nextInt();
                             if (price > balance) {
                                 System.out.println("Bakiye yetersiz.");
                             } else {
                                 balance -= price;
                             }
                             break;
                         case 3:
                             System.out.println("Bakiyeniz : " + balance);
                             break;
                         default:
                             break;
                     }
              }while (select != 4);
                System.out.println("Tekrar görüşmek üzere.");
                break;
            }else{
                right--;
                System.out.println("Hatalı kullanıcı adı veya şifre. Tekrar deneyiniz.");
                if(right ==0){
                    System.out.println("Hesabınız bloke olmuştur. Lütfen banka ile iletişime geçiniz.");
                }else {
                    System.out.println("Kalan hakkınız : " + right);
                }
            }
        }
    }
}