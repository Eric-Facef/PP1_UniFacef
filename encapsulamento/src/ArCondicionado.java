public class ArCondicionado {

    private String marca;
    private String modelo;
    private int temperatura;
    private boolean ligado;

    public ArCondicionado() {
    }
    public ArCondicionado(String marca, String modelo, int temperatura, boolean ligado) {
        setMarca(marca);
        this.modelo = modelo;
        setTemperatura(temperatura);
        this.ligado = ligado;
    }
    public void setMarca(String m) {
        if (m != null && m.length() >= 3) {
            this.marca = m;
        } else {
            System.out.println("Marca inválida!");
        }
    }
    public void setTemperatura(int t) {
        if (t >= 16 && t <= 30) {
            this.temperatura = t;
        } else {
            System.out.println("Temperatura fora da faixa");
        }
    }
    public String getMarca() {
        return marca;
    }
    public String getModelo() {
        return modelo;
    }
    public int getTemperatura() {
        return temperatura;
    }
    public boolean isLigado() {
        return ligado;
    }
    public void ativarModoTurbo() {
        if (verificarCompressor()) {
            setTemperatura(16);
            System.out.println("Modo Turbo ativado!");
        } else {
            System.out.println("Falha no compressor. Turbo não pode ser ativado.");
        }
    }
    private boolean verificarCompressor() {
        int numero = (int)(Math.random() * 5); // gera 0 a 4
        return numero > 2;
    }
    public String toString() {
        return "Marca: " + marca +
                "\nModelo: " + modelo +
                "\nTemperatura: " + temperatura +
                "\nLigado: " + (ligado ? "Sim" : "Não");
    }
}