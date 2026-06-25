public class TestaCarro {
    public static void main(String args[]){
        // cria uma instância da classe Carro - objeto
        Carro obj1 = new Carro("Fiat", "Uno");
        // exibe os dados
        System.out.println(obj1.toString());
        obj1.ligar();
        obj1.acelerar(80);
        obj1.frear(50);
        obj1.frear(40);
        System.out.println(obj1.toString());

        Carro obj2 = new Carro("GM", "Onix");
        // exibe os dados
        System.out.println(obj2.toString());
        obj2.ligar();
        obj2.acelerar(120);
        System.out.println(obj2.toString());

        obj1.desligar();
        obj2.desligar();
    }
}
