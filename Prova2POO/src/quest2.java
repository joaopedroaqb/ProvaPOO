import java.util.Scanner;
import java.util.Locale;

public class quest2 {
    private String nomeCurso;

    public quest2(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public void mostraMensagem() {
        System.out.println("Bem-vindo ao livro de notas do curso de " + nomeCurso);
    }

    public void calculaMediaClasse() {
    	Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite as 10 notas:");

        float somaNotas = 0;
        for (int i = 0; i < 10; i++) {
            System.out.print("Nota " + (i+1) + ": ");
            float nota = scanner.nextFloat();
            somaNotas += nota;
        }

        float media = somaNotas / 10;
        System.out.println("A média da classe é: " + String.format("%.2f", media));


        char conceitoMedia = calculaConceito(media);
        System.out.println("O conceito da média é: " + conceitoMedia);
    }

    public char calculaConceito(float nota) {
    	Locale.setDefault(Locale.US);
        if (nota >= 95 && nota <= 100) {
            return 'A';
        } else if (nota >= 80 && nota <= 94) {
            return 'B';
        } else if (nota >= 60 && nota <= 79) {
            return 'C';
        } else if (nota >= 40 && nota <= 59) {
            return 'D';
        } else if (nota >= 20 && nota <= 39) {
            return 'E';
        } else {
            return 'F';
        }
    }

    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do livro: ");
        String nomeLivro = scanner.nextLine();

        quest2 livro = new quest2(nomeLivro);

        livro.mostraMensagem();

        livro.calculaMediaClasse();
    }
}