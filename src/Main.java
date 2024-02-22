import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Değişkenleri tanımlayalım.
        int year;
       // Kullanıcıdan girdi alalım.
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen yıl giriniz :");
        year = input.nextInt();
       // Girilen yılın artık yıl olup olmadığını kontrol edelim.
        if (year%4 == 0){
            if (year%100 == 0 && !(year%400 == 0)){
                System.out.print(year + " artık yıl değildir!");
        } else {
                System.out.print(year + " bir artık yıldır!");
            }
        }else {
            System.out.print(year + " artık yıl değildir!");
        }
    }
}