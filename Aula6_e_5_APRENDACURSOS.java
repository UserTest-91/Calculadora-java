package aula6_e_5_aprendacursos;
import java.util.Scanner;
public class Aula6_e_5_APRENDACURSOS {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        Scanner b = new Scanner(System.in);
        Scanner n = new Scanner(System.in);
        
        System.out.println("Calculadora java");
        
        System.out.println("Digite o valor 1: ");
        Float valor1 = a.nextFloat();
        
        System.out.println("Digite o valor 2: ");
        Float valor2 = b.nextFloat();
        
        System.out.println("Digite o calculo (+, -, *, /): ");
        String calculo = n.nextLine();
        
        switch (calculo) {
            case "+":
                Float resultado = valor1 + valor2;
                System.out.println(resultado);
                break;
            case "-":
                Float resultado1 = valor1 - valor2;
                System.out.println(resultado1);
                break;
            case "*":
                Float resultado2 = valor1 * valor2;
                System.out.println(resultado2);
                break;
            case "/":
                Float resultado3 = valor1 / valor2;
                System.out.println(resultado3);
                break;
        }
    }
    
}
