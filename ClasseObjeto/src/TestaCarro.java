public class TestaCarro {
    public static void main(String[] args) {
        // cria uma instancia da classe Carro - Obj
        Carro obj1 = new Carro("Chevrolet", "Astra");
        // exibir os dados
        System.out.println(obj1.toString());
        obj1.ligar();
        obj1.acelerar(80);
        System.out.println(obj1.toString());
        obj1.desacelerar(30);
        System.out.println(obj1.toString());

        Carro obj2 = new Carro("Honda", "Civic");
        System.out.println(obj2.toString());
        obj2.ligar();
        obj2.acelerar(130);
        System.out.println(obj2.toString());
        obj2.desacelerar(40);
        System.out.println(obj2.toString());

        Carro obj3 = new Carro("Volkswagen", "Gol" );
        System.out.println(obj3.toString());
        obj3.ligar();
        obj3.acelerar(180);
        System.out.println(obj3.toString());
        obj3.desacelerar(80);
        System.out.println(obj3.toString());

        obj1.desligar();
        obj2.desligar();
        obj3.desligar();
    }
}
