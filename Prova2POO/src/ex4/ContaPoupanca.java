package ex4;

class ContaPoupanca extends ContaBancaria {
    private int diaDeRendimento;

    public ContaPoupanca(String cliente, int numConta, int diaDeRendimento) {
        super(cliente, numConta);
        this.diaDeRendimento = diaDeRendimento;
    }

    public int getDiaDeRendimento() {
        return diaDeRendimento;
    }

    public void calcularNovoSaldo(float taxaRendimento) {
        float novoSaldo = getSaldo() * (1 + taxaRendimento);
        setSaldo(novoSaldo);
        System.out.println("Saldo atualizado com taxa de rendimento. Novo saldo: R$" + novoSaldo);
    }
}