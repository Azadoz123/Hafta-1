import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int heat;

        Scanner input = new Scanner(System.in);
        System.out.println("Sıcaklık Giriniz :");
        heat = input.nextInt();

        if(heat < 5){
            System.out.println("Kayak yapabilirsiniz.");
        } else if (heat >= 5 && heat <= 25) {
            if(heat <= 15){
                System.out.println("Sinemya gidebilirsiniz.");
            }
            if (heat >= 10){
                System.out.println("Pikniğe gidebilirsiniz.");
            }
        }else {
            System.out.println("Yüzmeye gidebilirsiniz.");
        }
    }
}