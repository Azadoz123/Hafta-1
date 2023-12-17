import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int number, mod=0, x=0;

        Scanner input = new Scanner(System.in);
        System.out.print("Sayıyı giriniz : ");
        number = input.nextInt();

        while (number != 0){
            mod += number % 10;
            number = number / 10;
        }
        System.out.println("Sonuç : " + mod);
    }
}