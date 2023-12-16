import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int yil;

        //Kullanıcıdan veri alma
        Scanner input = new Scanner(System.in);
        System.out.print("Yıl giriniz :");
        yil = input.nextInt();

        //Artık yıl bulma
        if(yil % 4 == 0){
            if( (yil % 100 == 0) && (yil % 400 != 0)){
                System.out.println(yil + " bir artık yıl değildir ! !");
            }else {
                System.out.println(yil +" bir artık yıldır !");
            }
        }else {
            System.out.println(yil +" bir artık yıl değildir !");
        }
    }
}