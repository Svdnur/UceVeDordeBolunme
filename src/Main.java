import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a,b;

        System.out.println("Lütfen bir sayı giriniz :");
        a = input.nextInt();

        for ( b=0 ; b<=a ; b++ ){

            if((b % 3 == 0) && ( b % 4 == 0)){
                System.out.println(b);
            }
        }

    }
}
