package Secao4;
import java.util.Locale;

public class App {
    public static void main(String[] args) throws Exception {

        /*OBERSERVAÇÕES
        print =  print sem quebra de linha
        ex: System.out.print(x);
        println =  print com quebra de linha 
        ex: System.out.prinln(x);
        printf = para formatação
        ex: System.out.printf("%.2f%n", x)
        
        Concatenação simples usando " + "
        ex:
        System.out.println("RESULTADO = " + x + " Metros");

        Concatenação com print f e %
        ex:
        System.out.printf("RESULTADO = %.2f metros%n", x);

        OBS:
        %f = ponto flutuante
        %d = inteiro 
        %s = texto
        %n = quebra de linha


        */

        double x = 10.35784;
        String nome = "Caike";
        int idade = 23;
        double renda = 228000.0;

        System.out.println(x);
        System.out.printf("%.2f%n", x);

        System.out.println("Hello, World!");
        Locale.setDefault(Locale.US);
        System.out.println("RESULTADO = " + x + " Metros");
        System.out.printf("RESULTADO = %.2f metros%n", x);
        System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);
    }

}
