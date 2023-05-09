import java.util.Locale;
import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double paisA = 5000000;
		double paisB = 7000000;
		int i=0;

		while(paisB > paisA) {

			i++;
			paisA += paisA*0.03;
			paisB += paisB*0.02;
		}
		
		double populacaoA = Math.floor(paisA);
		double populacaoB = Math.floor(paisB);

		System.out.printf("O tempo necessário foi de %d anos.\n"
				+ "Ao final com o total de aproximadamente %.0f habitantes para a população A e aproximadamente %.0f habitantes para a população B.", i,populacaoA,populacaoB);

		sc.close();

	}

}

