import java.util.Locale;
import java.util.Scanner;

public class Ex3{

    public static void main(String[] args) {
    	Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int n1, n2, op;

        System.out.print("Digite o primeiro número: ");
        n1 = sc.nextInt();

        System.out.print("Digite o segundo número: ");
        n2 = sc.nextInt();

        System.out.println("Digite a operação desejada:");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        System.out.println("5 - Modulo");
        op = sc.nextInt();

        switch (op) {
            case 1:
            	System.out.println("Você escolheu Soma.");
                System.out.println("Resultado: " + (n1 + n2));
                break;
            case 2:
            	System.out.println("Você escolheu Subtração.");
                System.out.println("Resultado: " + (n1 - n2));
                break;
            case 3:
            	System.out.println("Você escolheu Multiplicação.");
                System.out.println("Resultado: " + (n1 * n2));
                break;
            case 4:
            	System.out.println("Você escolheu Divisão.");
                System.out.println("Resultado: " + ((double) n1 / n2));
                break;
            case 5:
            	System.out.println("Você escolheu Modulo. ");
            	System.out.println("Resultado: " + ((double)n1 % n2));
            	break;
            default:
                System.out.println("Opção inválida!");
        }
        
        sc.close(); 
    }
}