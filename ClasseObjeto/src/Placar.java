public class Placar {
    private String nomeTimeCasa, nomeTimeVisitante;
    private int pontosCasa, pontosVisitante, periodoQuarto;

    public Placar(String nomeTimeCasa,String nomeTimeVisitante) {
        this.nomeTimeCasa = nomeTimeCasa;
        this.nomeTimeVisitante = nomeTimeVisitante;
        this.pontosCasa = 0;
        this.pontosVisitante = 0;
        this.periodoQuarto = 1;
    }
    public void registrarPonto(String time, int tipo) {
        if (tipo != 1 && tipo != 2 && tipo != 3) {
            System.out.println("Tipo de ponto inválido!");
            return;
        }
        if (time.equalsIgnoreCase("casa")) {
            pontosCasa += tipo;
        } else if (time.equalsIgnoreCase("visitante")) {
            pontosVisitante += tipo;
        } else {
            System.out.println("Time inválido! Use 'casa' ou 'visitante'.");
        }
    }
    public void proximoQuarto() {
        if (periodoQuarto < 4) {
            periodoQuarto++;
        } else {
            System.out.println("O jogo terminou!");
        }
    }
    public String toString() {
        return nomeTimeCasa + " " + pontosCasa +
                " x " +
                pontosVisitante + " " + nomeTimeVisitante +
                " - Período: " + periodoQuarto;
    }
}

