public class Drone {

    private String codigo;
    private float altura;
    private int bateria;
    private boolean emVoo;

    public Drone(String codigo, int bateria) {
        this.codigo = codigo;
        setBateria(bateria);
        this.altura = 0;
        this.emVoo = false;
    }
    public void setAltura(float a) {
        if (a >= 0 && a <= 120) {
            this.altura = a;
        } else {
            System.out.println("Altura inválida! O drone deve ficar entre 0 e 120 metros.");
        }
    }
    public void setBateria(int b) {
        if (b >= 0 && b <= 100) {
            this.bateria = b;
        } else {
            System.out.println("Valor de bateria inválido! Use entre 0 e 100.");
        }
    }
    public float getAltura() {
        return altura;
    }
    public int getBateria() {
        return bateria;
    }
    public boolean isEmVoo() {
        return emVoo;
    }
    public void decolar() {
        if (bateria <= 20) {
            System.out.println("Bateria insuficiente para decolar!");
            return;
        }
        if (testarMotores()) {
            emVoo = true;
            setAltura(2);
            System.out.println("Drone decolou com sucesso!");
        } else {
            System.out.println("Falha nos motores. Decolagem cancelada.");
        }
    }

    private boolean testarMotores() {
        System.out.println("Testando hélices...");
        System.out.println("Calibrando GPS...");

        int teste = (int)(Math.random() * 10); // 0 a 9
        return teste < 8;
    }
    public void subir(float x) {
        if (emVoo) {
            setAltura(altura + x);
        } else {
            System.out.println("O drone precisa estar em voo para subir.");
        }
    }
    public void descer(float x) {
        if (emVoo) {
            setAltura(altura - x);
        } else {
            System.out.println("O drone precisa estar em voo para descer.");
        }
    }
    public String toString() {
        return "Código: " + codigo +
                "\nAltura: " + altura + " m" +
                "\nBateria: " + bateria + "%" +
                "\nEm voo: " + (emVoo ? "Sim" : "Não");
    }
}
