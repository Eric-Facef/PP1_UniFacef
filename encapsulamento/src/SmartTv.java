public class SmartTv{
    private String marca, modelo;
    private int volume;
    private boolean conectadoInternet;

    public SmartTv() { // new SmartTv()
        this.marca = "";
        this.modelo = "";
        this.conectadoInternet = false;
    }
    public SmartTv(String marca, String modelo, int volume) {
        this.setMarca(marca );
        this.setModelo(modelo);
        this.setVolume(volume);
        this.conectadoInternet = false;
    }
    // setters e getters
    public void setVolume(int volume) {
        if (volume >= 0 && volume <= 100) {
            this.volume = volume;
        }else {
            System.out.println("Volume inválido");
        }
    }
    public int getVolume() {
        return this.volume;
    }
    public void setMarca(String marca) {
        // a marca precisa ter a primeira letra maiuscula

        char aux = marca.charAt(0);
        boolean resp = Character.isUpperCase(aux);

        if(resp)
            this.marca = marca;
        else
            System.out.println("Marca inválida!");
    }
    public String getMarca() {
        return this.marca;
    }
    public void setModelo(String modelo) {
        if(modelo.length() <= 30) {
            this.modelo = modelo;
        }else {
            System.out.println("Modelo inválido");
        }
    }
    public String getModelo() {
        return this.modelo;
    }
    public void aumentarVolume(int x) {
        this.setVolume(this.volume + x);
    }
    public void diminuirVolume(int x) {
        this.setVolume(this.volume - x);
    }
    public void abrirYoutube() {
        if(this.conectadoInternet()) {
            System.out.println("Abrindo Youtube");
        } else {
            System.out.println("Sem acesso para abrir o Youtube");
        }
    }
    // só pode ser usado nessa classe
    private boolean conectadoInternet() {
        System.out.println("Buscando sinal de Wi-Fi");
        System.out.println("Verificando credenciais");
        System.out.println("Autenticando IP no roteador");
        int random = (int)(Math.random() * 10);
        if (random < 5) {
            this.conectadoInternet = true;
            return true;
        } else {
            this.conectadoInternet = false;
            return false;
        }
    }
    public String toString() {
        return "Marca: " + this.marca +
                " | Modelo: " + this.modelo +
                " | Volume: " + this.volume +
                " | Conectado à internet: " +
                (this.conectadoInternet ? "Sim" : "Não");
    }
}