import java.util.Locale;
import java.util.Scanner;

public class Ex1{

    public static void main(String[] args) {
    	
    	Locale.setDefault(Locale.US);
        
        	Scanner sc = new Scanner(System.in);
        
        	System.out.print("Digite o nome do funcionario: ");
        	String nome = sc.nextLine();
        
        	System.out.print("Digite o valor recebido por hora: ");
        	double valorHora = sc.nextDouble();
        
        	System.out.print("Digite a quantidade de horas trabalhadas: ");
        	double horasT = sc.nextDouble();
        
        	double salario = valorHora * horasT;
        
        	System.out.println("Nome: "+ nome);
        	System.out.println("Valor por hora: "+ valorHora);
        	System.out.println("Horas trabalhadas: "+ horasT);
        	System.out.println("O pagamento para " +nome+ " deve ser " + salario );
        
        sc.close();
    }
}
