package ex4;

class ContaEspecial extends ContaBancaria {
	
    private double limite;

    public ContaEspecial(String cliente, int numConta, double limite) {
        super(cliente, numConta);
        this.limite = limite;
    }

    public double getLimite() {
        return limite;
    }

    @Override
    public void sacar(float valor) {
    	
        if (valor > 0 && (getSaldo() - valor) >= -limite) {
            setSaldo(getSaldo() - valor);
            System.out.println("Saque de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente para realizar o saque de R$" + valor + ".");
        }
    }
}