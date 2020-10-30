package ba.unsa.etf.rpr;
import java.util.Scanner;

public class Main {

    static void sumaCifara(int n){
        for(int i = 1; i <= n; i++){
            int pomocna = i;
            int suma = 0;
            while(pomocna > 0){
                int cifra = pomocna % 10;
                suma = suma + cifra;
                pomocna = pomocna / 10;
            }
            if(i % suma == 0) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
	// write your code here
        System.out.println("Unesite neki broj ");
        Scanner ulaz = new Scanner(System.in);
        int n = ulaz.nextInt();
        System.out.println("Brojevi koji su djeljivi sa sumom svojih cifara: ");
        sumaCifara(n);

    }
}
