import java.util.ArrayList;
import java.util.Date;

public class Pedido {
    private int id;
    private Date data;
    private Cliente cliente; // associação todo-parte
    private ArrayList<ItemPedido> itensPedido;

    public Pedido() {
        this.itensPedido = new ArrayList(); // aloca espaço na memória para vetor
    }

    public Pedido(int id, Date data, Cliente cliente) {
        this.id = id;
        this.data = data;
        this.cliente = cliente; // agregação
        this.itensPedido = new ArrayList(); // aloca espaço na memória para vetor
    }

    public void adicionaItemPedido(int id, int qtde, Produto produto){
        ItemPedido aux = new ItemPedido(id, qtde, produto);
        this.itensPedido.add(aux);
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

    // calcular o total geral do Pedido
    public void calcularTotal(){
        float total = 0;
        for(ItemPedido aux: this.itensPedido){
            total += aux.getQtde() * aux.getProduto().getPreco();
        }
        System.out.println("Valor total do pedido " + total);
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "id=" + id +
                ", data=" + data +
                ", cliente=\n" + cliente +
                ", Itens do Pedidod=\n" + itensPedido +
                '}';
    }
}
