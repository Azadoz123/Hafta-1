import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
       int number,total=0, oldNumber=0, newNumber =1;

       //Kullanıcıdan veri alma
       Scanner input = new Scanner(System.in);
        System.out.print("Kaç elemanlı Fibonacci serisi istiyorsunuz: ");
       number = input.nextInt();

        for(int i=0; i<number;i++){
            System.out.print(oldNumber + " ");
            //önceki sayı ile yeni sayının toplamı
            total=oldNumber + newNumber;
            //önceki sayıyı hafızda tutma
            oldNumber = newNumber;
            //toplam artık yeni sayımız oldu
            newNumber = total;
        }
    }
}