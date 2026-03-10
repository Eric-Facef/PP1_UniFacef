public class Conta {
    public int numeroConta, agencia;
    public String nomeCliente;
    public float saldo;
    public boolean status;

    public Conta(int numeroConta, int agencia, String nomeCliente) {
        this.numeroConta = numeroConta;
        this.agencia = agencia;
        this.nomeCliente = nomeCliente;
        this.saldo = 0.0f;
        this.status = true;
    }
    public void depositar(float valor) {
        if (!this.status)
            throw new Error("Para depósito a conta precisa estar ativa!");

        if (valor <= 0)
            throw new Error("O valor do depósito deve ser positivo!");

        this.saldo += valor;
    }
    public void sacar(float valor) {
        if (!this.status)
            throw new Error("Para depósito a conta precisa estar ativa!");
        if (valor > this.saldo)
            System.out.println("Saldo insuficiente.");
        this.saldo -= valor;
        System.out.println("Saque realizado com sucesso!");

    }
    public void encerrarConta() {
        if (this.status){
            this.status = false;
            System.out.println("Conta já está encerrada.");
        }


    }
    public String toString() {
        return "Número: " + numeroConta +
                "\nAgência: " + agencia +
                "\nCliente: " + nomeCliente +
                "\nSaldo: R$ " + saldo +
                "\nStatus: " + (this.status ? "Ativa" : "Encerrada");
    }
}

