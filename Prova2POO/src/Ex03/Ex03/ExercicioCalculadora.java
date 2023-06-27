package Ex03;
import java.util.Scanner;
import java.util.Locale;



public class ExercicioCalculadora {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Basica b = new Basica();
		Cientifica c = new Cientifica();
		
		System.out.println("------------------");
		System.out.println("    Calculadora   ");
		System.out.println("------------------");
		
		System.out.println("Escolha Uma Calculadora:");
		System.out.println("1 - Básica");
		System.out.println("2 - Científica");
		int escolha1 = sc.nextInt();
		
		switch(escolha1) {
			case 1:
				exibirMenuBasica();
				break;
			case 2:
				exibirMenuCientifica();
				break;
			default:
				System.out.println("ERRO!");
		}
		
		System.out.println("Escolha uma das operações:");
		int escolha2 = sc.nextInt();
		
		switch(escolha2) {
		
			case 1:
				System.out.println("Informe dois valores a serem somados: ");
				System.out.print("Valor 1:");
				double valA = sc.nextDouble();
				System.out.print("Valor 2:");
				double valB = sc.nextDouble();
				System.out.println("Resultado é: " +b.Somar(valA, valB) );
				break;
				
			case 2:
				System.out.println("Informe dois valores a serem subtraidos: ");
				System.out.print("Valor 1:");
				double valA1 = sc.nextDouble();
				System.out.print("Valor 2:");
				double valB1 = sc.nextDouble();
				System.out.println("Resultado é: " + b.Subtrair(valA1, valB1) );
				break;
				
			case 3:
				System.out.println("Informe dois valores a serem multiplicados: ");
				System.out.print("Valor 1:");
				double valA2 = sc.nextDouble();
				System.out.print("Valor 2:");
				double valB2 = sc.nextDouble();
				System.out.println("Resultado é: " + b.Multiplicar(valA2, valB2) );
				break;
				
			case 4: 
				System.out.println("Informe dois valores a serem divididos: ");
				System.out.print("Valor 1:");
				double valA3 = sc.nextDouble();
				System.out.print("Valor 2:");
				double valB3 = sc.nextDouble();
				System.out.println("Resultado é: " + b.Dividir(valA3, valB3) );
				break;
				
			case 5:
				System.out.print("Informe um valor:");
				double valA4 = sc.nextDouble();
				System.out.print("Informe a porcentagem desejada desse valor:");
				double valB4 = sc.nextDouble();
				System.out.println("Resultado é: " + b.Porcentagem(valA4, valB4) );
				break;
				
			case 6:
				System.out.println("Informe o valor a ser descoberto a raiz quadrada: ");
				System.out.print("Valor:");
				double valA5 = sc.nextDouble();
				System.out.println("Resultado é: " + c.Raiz(valA5) );
				break;
				
			case 7:
				System.out.print("Informe o valor da base:");
				double valA6 = sc.nextDouble();
				System.out.print("Informe o valor do expoente");
				double valB6 = sc.nextDouble();
				System.out.println("Resultado é: " + c.Potencia(valA6, valB6) );
				break;
				
			case 8:
				System.out.print("Informe o valor do dividendo:");
				double valA7 = sc.nextDouble();
				System.out.print("Informe o valor do divisor:");
				double valB7 = sc.nextDouble();
				System.out.println("Resultado é: " + c.Modulo(valA7, valB7) );
				break;
				
		}

	}



	public static void exibirMenuBasica() {
		System.out.println("----------------------");
		System.out.println("==CALCULADORA BASICA==");
		System.out.println("----------------------");
		
		System.out.println("FUNÇÕES:");
		System.out.println("1 - Soma");
		System.out.println("2 - Subtração");
		System.out.println("3 - Multiplicação");
		System.out.println("4 - Divisão");
		System.out.println("5 - Porcentagem");
	}
	
	public static void exibirMenuCientifica() {
		System.out.println("--------------------------");
		System.out.println("==CALCULADORA CIENTIFICA==");
		System.out.println("--------------------------");
		
		System.out.println("FUNÇÕES:");
		System.out.println("1 - Soma");
		System.out.println("2 - Subtração");
		System.out.println("3 - Multiplicação");
		System.out.println("4 - Divisão");
		System.out.println("5 - Porcentagem");
		System.out.println("6 - Raiz quadrada");
		System.out.println("7 - Potência");
		System.out.println("8 - Módulo");
	}
	
}