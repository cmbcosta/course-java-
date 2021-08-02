package Secao4;
import java.util.Scanner;
import java.util.Locale;

public class Aula2 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        /*
         * String x; x = scanner.next(); System.out.println("O Mais lindo " + x);
         */
        /*
         * int x; x = scanner.nextInt(); System.out.println("Seu numero é " + x);
         */
        String x;
        int y;
        double z;
        char c;
        System.out.println("Digite uma letra ");
        c = scanner.next().charAt(0);
        System.out.println("Digite um nome ");
        x = scanner.next();
        System.out.println("Digite um int ");
        y = scanner.nextInt();
        Locale.setDefault(Locale.US);
        System.out.println("Digite um numero com virgula ");
        z = scanner.nextDouble();
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(c);
    }

}