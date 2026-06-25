public interface IPagamento{
    // contrato: quem implementar essa interface, deve implementar esse métodos

    void autorizar(float valor);

    void exibirComprovante();

}