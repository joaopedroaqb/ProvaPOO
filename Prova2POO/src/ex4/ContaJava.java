package ex4;
import java.util.Scanner;
import java.util.Locale;

public class ContaJava {
    public static void main(String[] args) {
    	Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do cliente: ");
        String cliente = scanner.nextLine();

        System.out.print("Digite o número da conta: ");
        int numConta = scanner.nextInt();

        ContaBancaria conta1 = new ContaBancaria(cliente, numConta);

        System.out.print("Digite o dia de rendimento da conta poupança: ");
        int diaDeRendimento = scanner.nextInt();

        ContaPoupanca conta2 = new ContaPoupanca(cliente, numConta + 1, diaDeRendimento);

        System.out.print("Digite o limite da conta especial: ");
        double limite = scanner.nextDouble();

        ContaEspecial conta3 = new ContaEspecial(cliente, numConta + 2, limite);

        int opcao;
        do {
            System.out.println("\n----- Menu de Opções -----");
            System.out.println("1. Sacar um determinado valor");
            System.out.println("2. Depositar um determinado valor");
            System.out.println("3. Calcular novo saldo da conta poupança");
            System.out.println("4. Mostrar dados das contas do cliente");
            System.out.println("0. Sair");
            System.out.print("Digite a opção desejada: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o valor a ser sacado: ");
                    float valorSaque = scanner.nextFloat();
                    conta1.sacar(valorSaque);
                    break;
                case 2:
                    System.out.print("Digite o valor a ser depositado: ");
                    float valorDeposito = scanner.nextFloat();
                    conta1.depositar(valorDeposito);
                    break;
                case 3:
                    if (conta2 instanceof ContaPoupanca) {
                        System.out.print("Digite a taxa de rendimento da conta poupança: ");
                        float taxaRendimento = scanner.nextFloat();
                        ContaPoupanca poupanca = (ContaPoupanca) conta2;
                        poupanca.calcularNovoSaldo(taxaRendimento);
                    } else {
                        System.out.println("Essa operação é válida apenas para contas poupança.");
                    }
                    break;
                case 4:
                    mostrarDadosContas(new ContaBancaria[]{conta1, conta2, conta3}, cliente);
                    break;
                case 0:
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida. Digite novamente.");
            }
        } while (opcao != 0);

        scanner.close();
    }

    public static void mostrarDadosContas(ContaBancaria[] contas, String cliente) {
        System.out.println("\nDados das contas de " + cliente + ":");

        for (ContaBancaria conta : contas) {
            if (conta.getCliente().equals(cliente)) {
                System.out.println("Número da conta: " + conta.getNumConta());
                System.out.println("Saldo: R$" + conta.getSaldo());
            }
        }
    }
}



