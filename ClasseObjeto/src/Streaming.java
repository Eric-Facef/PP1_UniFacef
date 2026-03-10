public class Streaming {
    private String usuario, plano, ultimoFilmeAssistido;
    private float mensalidade;
    private boolean ativo;

    public Streaming(String usuario, String plano) {
        this.usuario = usuario;
        this.plano = plano;
        this.ultimoFilmeAssistido = "";
        this.ativo = true;

        switch (plano) {
            case "Básico":
                this.mensalidade = 25.90f;
                break;
            case "Premium":
                this.mensalidade = 45.90f;
                break;
            case "Familia":
                this.mensalidade = 60.90f;
                break;
            default:
                System.out.println("Plano invalido!");
        }
    }
    public String getUsuario() {
        return usuario;
    }
    public String getPlano() {
        return plano;
    }
    public float getMensalidade() {
        return mensalidade;
    }
    public boolean getAtivo() {
        return ativo;
    }
    public String getUltimoFilmeAssistido() {
        return ultimoFilmeAssistido;
    }
    public void assistirFilme(String nomeFilme) {
        if (this.ativo) {
            ultimoFilmeAssistido = nomeFilme;
            System.out.println("Assistindo: " + nomeFilme);
        } else {
            System.out.println("Conta suspensa! É necessário pagar a fatura.");
        }
    }
    public void cancelarAssinatura(){
        this.ativo = false;
    }
    public String toString() {
        String status = ativo ? "Ativo" : "Suspenso";

        return "Usuário: " + usuario +
                "\nPlano: " + plano +
                "\nMensalidade: R$ " + mensalidade +
                "\nStatus: " + status +
                "\nÚltimo Filme Assistido: " +
                (ultimoFilmeAssistido.isEmpty() ? "Nenhum" : ultimoFilmeAssistido);
    }
}
