package Secao4;
import java.util.Scanner;
import java.util.Locale;

public class Revisao4 {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        /*System.out.println("Digite valor 1");
        int x;
        x = scanner.nextInt();
        System.out.println("Digite valor 2");
        int y;
        y = scanner.nextInt();

        int soma = x + y;

        System.out.println("Sua Soma é " + soma);*/

        /*System.out.println("Digite valor de A");
        int A;
        A = scanner.nextInt();
        System.out.println("Digite valor de B");
        int B;
        B = scanner.nextInt();
        System.out.println("Digite valor de C");
        int C;
        C = scanner.nextInt();
        System.out.println("Digite valor de D");
        int D;
        D = scanner.nextInt();

        int soma1 = ((A * B) - (C * D));

        System.out.println("A Soma dos 4 valores é  " + soma1);*/

        /*int funcionarios;
        int horasTrabalhadas;
        double valorHoras;
        System.out.println("Digite o numero de funcionarios: ");
        funcionarios = scanner.nextInt();
        System.out.println("Digite as horas Trabalhadas: ");
        horasTrabalhadas = scanner.nextInt();
        Locale.setDefault(Locale.US);
        System.out.println("Digite Valor da hora de serviço: ");
        valorHoras = scanner.nextDouble();

        double salario = (double)horasTrabalhadas * valorHoras;

        System.out.println("Numero de funcionarios: " + funcionarios);
        System.out.printf("Salario: %.2f%n", salario);*/

        /*int codigo;
        int pecas;
        double valor;
        int codigo2;
        int pecas2;
        double valor2;

        System.out.println("codigo peça 1: ");
        codigo = scanner.nextInt();
        System.out.println("Numero peças 1: ");
        pecas = scanner.nextInt();
        System.out.println("valor 1: ");
        valor = scanner.nextDouble();
        System.out.println("codigo peça 2: ");
        codigo2 = scanner.nextInt();
        System.out.println("Numero de peças 2: ");
        pecas2 = scanner.nextInt();
        System.out.println("valor 2: ");
        valor2 = scanner.nextDouble();

        double valorAPagar = ((pecas * valor) + (pecas2 * valor2));

        System.out.printf("Valor a Pagar: %.2f%n", valorAPagar);*/

        Locale.setDefault(Locale.US);
		
		double A, B, C, triangulo, circulo, trapezio, quadrado, retangulo;
		
		A = scanner.nextDouble();
		B = scanner.nextDouble();
		C = scanner.nextDouble();
		
		triangulo = A * C / 2.0;
		circulo = 3.14159 * C * C;
		trapezio = (A + B) / 2.0 * C;
		quadrado = B * B;
		retangulo = A * B;
		
		System.out.printf("TRIANGULO: %.3f%n", triangulo);
		System.out.printf("CIRCULO: %.3f%n", circulo);
		System.out.printf("TRAPEZIO: %.3f%n", trapezio);
		System.out.printf("QUADRADO: %.3f%n", quadrado);
		System.out.printf("RETANGULO: %.3f%n", retangulo);
    }

}
