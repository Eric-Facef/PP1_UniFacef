//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Carro {
    // variaveis
    public String marca, modelo;
    public float velocidade;
    public boolean motor;

    // metodos da classe
    // metodo construtor - constroi o obj - inicializar as variaveis
    public Carro(String marca, String modelo) {
        // marca é o valor do usuario / this.marca é o valor do obj
        this.marca = marca;
        this.modelo = modelo;
        this.velocidade = 0;
        this.motor = false;
    }
    public void ligar() {
        if (!this.motor) {
            this.motor = true;
            System.out.println("O carro foi ligado!");
        }
    }
    public void desligar() {
        if (this.motor) {
            this.motor = false;
            this.velocidade = 0;
            System.out.println("O carro foi desligado!");
        }
    }
    public void acelerar(float x) {
        if (this.motor){
            this.velocidade = this.velocidade + x;
            System.out.println("Acelerando para " + this.velocidade);
        }else {
            System.out.println("Não é possível acelerar com o carro desligado");
        }
    }
    public void desacelerar(float x) {
        if (this.motor && velocidade - x >= 0){
            this.velocidade = this.velocidade - x;
            System.out.println("Desacelerando para " + this.velocidade);
        } else {
            System.out.println("Não foi possivel freiar pois esta desligado");
        }
    }
    // converte obj em string
    public String toString() {
        return "Marca: " + this.marca + " Modelo: " + this.modelo + " Vel: " + this.velocidade + " Motor: " + (this.motor ? "Ligado" : "Desligado");
    }
}