// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        for(int i=2; i<=100;i++){
            //Asal olup olmadığını kontrol edilecek sayıyı loopa sokma
            for(int j =2; j<=i; j++){
                //Böleni olup olmadığını kontrol etme
                if( (i%j == 0) && (i!=j)) {
                    j = i;
                    continue;
                    //Asal sayıyı ekrana yazdırma
                }
                if(i==j)
                    System.out.print(j + " ");
            }
        }
    }
}