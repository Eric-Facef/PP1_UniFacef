import java.util.Date;

public class TestaTodoParte {
    public static void main(String[] args){
        // Cliente é independente do Pedido
        Cliente cl1 = new Cliente(100, "Fulano", "123", "Rua 10");

        Pedido ped1 = new Pedido(1, new Date(), cl1);

        Produto prod1 = new Produto(10, "Mouse", "Mouse óptico", 200);
        Produto prod2 = new Produto(20, "Monitor", "Widescreen", 900);
        ped1.adicionaItemPedido(11, 3, prod1);
        ped1.adicionaItemPedido(12, 2, prod2);
        System.out.println(ped1.toString());
    }
}
