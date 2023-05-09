import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite um número natural N (Sendo N <= 15): ");
        int numero  = sc.nextInt();
        
        if (numero < 0 || numero > 15) {
            System.out.println("Valor inválido para N. O valor máximo é 15.");
            return;
        }
        
        int fatorial = 1;
        
        for (int i = 1; i <= numero; i++) {
            fatorial *= i;
        }
        
        System.out.println("O valor de N: " + numero);
        System.out.println("FATORIAL: "+ fatorial);
        sc.close();
    }
}
