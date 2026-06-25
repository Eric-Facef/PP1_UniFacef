public class Carro {
    // variáveis
    public String marca, modelo;
    public float velocidade;
    public boolean motor;

    // métodos da classe
    // método construtor - constroe o objeto e
    // inicializa as variáveis
    public Carro(String marca, String modelo){
        // marca é o valor do usuário
        // this.marca é o valor do objeto
        this.marca = marca;
        this.modelo = modelo;
        this.velocidade = 0;
        this.motor = false;
    }
    // ligar o carro
    public void ligar(){
        if (!this.motor) { // ! NOT - se não estiver ligado
            this.motor = true;
            System.out.println("carro foi ligado");
        }
    }
    // desligar o carro
    public void desligar(){
        if (this.motor){
            this.motor = false;
            this.velocidade = 0;
            System.out.println("carro foi desligado");
        }
    }
    // acelerar o carro de x unidades
    public void acelerar(float x){
        if (this.motor) {
            this.velocidade = this.velocidade + x;
            System.out.println("Nova velocidade " + this.velocidade);
        }
        else System.out.println("Não foi possível acelerar");
    }
    // frear o carro de x unidades
    public void frear(float x){
        if (this.motor && this.velocidade - x >= 0){
            this.velocidade -= x;
            System.out.println("Nova velocidade " + this.velocidade);
        }
        else System.out.println("Não foi possível frear");
    }
    // converte objeto em String
    public String toString(){
        return "Marca: " + this.marca + " Modelo: " + this.modelo
                + " Vel: " + this.velocidade +
                " Motor: " + (this.motor ? "ligador": "desligado");
    }

}