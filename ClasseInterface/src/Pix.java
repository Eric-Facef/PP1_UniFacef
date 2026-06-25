public class Pix implements IPagamento {
    private String chavePix;
    public Pix(String chavePix) {
        this.chavePix = chavePix;
    }
    @Override
    public void autorizar(float valor) {
        System.out.println("Gerando QR Code para a chave " + this.chavePix);
        System.out.println("Pagamento de R$ " + valor + " transferido de forma instantânea");
    }
    @Override
    public void exibirComprovante() {
        System.out.println("Comprovante disponível no App do banco");
    }
}
