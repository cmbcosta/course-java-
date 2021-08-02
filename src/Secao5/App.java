package Secao5;
import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        /*int hora;
        System.out.println("Quantas horas ?");
        hora = scanner.nextInt();

        if (hora < 12) {
            System.out.println("Bom dia");
        }else if (hora < 18) {
                System.out.println("Boa tarde");
            }else{
                System.out.println("Boa noite");
            }*/
        
        /*int minutos = scanner.nextInt();
        double conta = 50.0;
        if (minutos > 100) {
        conta += (minutos - 100) * 2.0;
        }
        System.out.printf("Valor da conta = R$ %.2f%n", conta);+&*/
        /*int x = scanner.nextInt(); 
         

        if (x %2 == 0) {
            System.out.println("par");
        }else{
            System.out.println("impar");
        }*/
        /*int x = scanner.nextInt();

        int soma = 0;
        while (x != 0) {
            x = scanner.nextInt();
            soma++;
        }
        System.out.println(soma);*/
        /*int senha = 0;
        senha = scanner.nextInt();
        while (senha != 2002) {
            System.out.println("Senha Invalida");
            senha = scanner.nextInt();
        }
        System.out.println("Acesso Permitido");*/
		/*int x = scanner.nextInt();
		int y = scanner.nextInt();
        while (x != 0 && y != 0) {
            if (x > 0 && y > 0) {
				System.out.println("primeiro");
			}
			else if (x < 0 && y > 0) {
				System.out.println("segundo");
			}
			else if (x < 0 && y < 0) {
				System.out.println("terceiro");
			}
			else {
				System.out.println("quarto");
			}
			x = scanner.nextInt();
			y = scanner.nextInt();
        }*/
        int N = scanner.nextInt();
        int soma = 0;
        for (int i = 0; i < N; i++) {
            int x = scanner.nextInt();
            soma = soma + x;

        }
        System.out.println(soma);
    }

}
