import java.util.ArrayList;
import java.util.Date;

public class Pedido {
    private int id;
    private Date data;
    private Cliente cliente; // associação todo-parte
    private ArrayList<ItemPedido> itemPedidos;

    public Pedido() {
        this.itemPedidos = new ArrayList(); // aloca espaço na memoria para o vetor
    }

    public Pedido(int id, Date data, Cliente cliente) {
        this.id = id;
        this.data = data;
        this.cliente = cliente; // agregação
        this.itemPedidos = new ArrayList();
    }

    public void adicionaItemPedido(int id, int qtde, Produto produto) {
        ItemPedido aux = new ItemPedido(id, produto, qtde);
        this.itemPedidos.add(aux);
        System.out.println("Item adicionado com sucesso");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    // calcular o total geral do pedido
    @Override
    public String toString() {
        return "Pedido{" +
                "id=" + id +
                ", data=" + data +
                ", cliente=" + cliente +
                ", Itens do pedido=\n" + itemPedidos +
                '}';
    }
}
