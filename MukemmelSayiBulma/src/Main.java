import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int number, total = 0;

        //Kullanıcıdan veri alma
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        number = input.nextInt();

        //Sayının çarpanlarının toplamını bulma
        for (int i =1; i<number; i++){
            //Sayının çarpanlarını bulma
           if(number%i == 0){
               total+=i;
           }
        }

        //Ekrana yazdırma
        if(total == number){
            System.out.println( number + " mükemmel sayıdır.");
        }else {
            System.out.println( number + " mükemmel sayı496 değildir.");
        }
    }
}