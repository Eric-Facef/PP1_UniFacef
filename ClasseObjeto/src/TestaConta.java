public class TestaConta {
    public static void main(String[] args) {
        Conta c1 = new Conta(1001, 123, "João Silva");
        Conta c2 = new Conta(1002, 123, "Maria Souza");

        c1.depositar(500);

        c1.sacar(200);

        System.out.println("\nEstado da conta c1:");
        System.out.println(c1);

        System.out.println("\nTentativa de saque na conta c2:");
        c2.sacar(50);

        System.out.println("\nTentativa de encerrar c1 com saldo:");
        c1.encerrarConta();

        System.out.println("\nSacando restante da conta c1:");
        c1.sacar(c1.saldo);

        System.out.println("\nEncerrando conta c1:");
        c1.encerrarConta();

        System.out.println("\nEstado final da conta c1:");
        System.out.println(c1);
    }
}
