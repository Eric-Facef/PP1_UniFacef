public class CartaoCredito implements IPagamento {
    private String nroCartao;
    public CartaoCredito(String nroCartao) {
        this.nroCartao = nroCartao;
    }
    @Override
    public void autorizar(float valor) {
        System.out.println("Verificando limite do cartão " + this.nroCartao);
        System.out.println("Pagamento de R$ " + valor + " autorizado via crédito");
    }
    @Override
    public void exibirComprovante() {
        System.out.println("Comprovante enviado para o seu email");
    }
}