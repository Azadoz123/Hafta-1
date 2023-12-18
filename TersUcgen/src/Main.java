import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int number;

        //Kullanıcıdan veri alma
        Scanner input = new Scanner(System.in);
        System.out.print("Basamak sayısını girniz: ");
        number = input.nextInt();

        //Basamak sayısı
        for (int i=0; i<=number; i++){
            //ilk boşluk sayısı
            for (int j=0; j<i; j++){
                System.out.print(" ");
            }
            //Yıldız sayısı
            for (int j=0; j<(2*(number - i) + 1); j++){
                System.out.print("*");
            }
            //Son boşluk sayısı
            for (int j=0; j<i; j++){
                System.out.print(" ");
            }
            System.out.println("");
        }
    }
}