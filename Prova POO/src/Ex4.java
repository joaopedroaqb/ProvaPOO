import java.util.Locale;
import java.util.Scanner;

public class Ex4{

    public static void main(String[] args) {
    	Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        float glicose;

        System.out.print("Digite a medida da Glicose: ");
        glicose = sc.nextFloat();

        if (glicose < 100) {
            System.out.println("Classificação: Normal");
        }else if (glicose > 100 || glicose < 140) {
        	System.out.println("Classificação: Elevado");
        } else {
            System.out.println("Classificação: Diabetes");
        }
        sc.close();
    }
}