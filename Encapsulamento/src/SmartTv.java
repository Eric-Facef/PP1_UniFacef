public class SmartTv {
    private String marca, modelo;
    private int volume;
    private boolean conectadaInternet;

    public SmartTv(){ // SmartTv obj1 = new SmatTv()
        this.marca = "";
        this.modelo = "";
        this.conectadaInternet = false;
    }
    public SmartTv(String marca, String modelo, int volume){
        this.setMarca(marca);
        this.setModelo(modelo);
        this.setVolume(volume);
        this.conectadaInternet = false;
    }
    // setters e getters
    public void setVolume(int volume){
        if (volume >= 0 && volume <= 100){
            this.volume = volume;
        }
        else System.out.println("Volume inválido");
    }
    public int getVolume(){
        return this.volume;
    }
    public void setMarca(String marca){
        // a marca precisa ter a primeira letra em maiúsculo
        char aux = marca.charAt(0);
        boolean resp = Character.isUpperCase(aux);
        if (resp){
            this.marca = marca;
        }
        else
            System.out.println("Marca inválida");
    }
    public String getMarca(){
        return this.marca;
    }
    public void setModelo(String modelo){
        if (modelo.length() <= 30){
            this.modelo = modelo;
        }
        else System.out.println("Modelo inválido");
    }
    public String getModelo(){
        return this.modelo;
    }

    public void abrirYouTube(){
        if (this.conectaInternet()){
            System.out.println("Abrindo YouTube");
        }
        else System.out.println("Sem Internet para abrir YouTube");
    }
    // só pode ser usado nesta classe
    private boolean conectaInternet(){
        System.out.println("Buscando sinal de wifi");
        System.out.println("Verificando credenciais");
        System.out.println("Autenticando IP no roteador");
        int random = (int) (Math.random() * 10);
        if (random < 5){
            this.conectadaInternet = true;
            return true;
        }
        else {
            this.conectadaInternet = false;
            return false;
        }
    }
    // aumenta o volume da SmartTv
    public void aumentaSom(int x){
        this.setVolume(this.volume + x);
    }
    // diminui o volume da SmartTv
    public void diminuiSom(int x){
        this.setVolume(this.volume - x);
    }
    public String toString(){
        return "Marca: " + this.marca + " Modelo: " + this.modelo +
                " Volume: " + this.volume +
                "Conectado na Internet " + (this.conectadaInternet ? "Sim": "Não");
    }
}