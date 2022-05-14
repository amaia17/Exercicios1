package professor2;
import java.util.ArrayList;
import java.util.Iterator;

public class Pedido {

    private ArrayList<ItemPedido> itens;
    private double valor_total;

    public Pedido() {
        itens = new ArrayList<>();
    }

    public void adicionarItem(ItemPedido itemNovo) {
        itens.add(itemNovo);
        double valorItem;
        valorItem = itemNovo.getProduto().getValor() * itemNovo.getQuantidade();
        atualizarValorTotal(valorItem);
    }

    public void imprimirItens(){
        Iterator iterador = itens.iterator();
        ItemPedido item;
        while(iterador.hasNext()){
            item = (ItemPedido) iterador.next();
            System.out.println("\nNome do produto: "+item.getProduto().getDescricao()+"\nValor do produto: R$"+item.getProduto().getValor()+"\nQuantidade do produto: "+item.getQuantidade());
        }
    }

    private void atualizarValorTotal(double valor){
        this.valor_total = this.valor_total + valor;
    }

    public Double getValorTotal() {
        return valor_total;
    }

    public void setValorTotal(Double valorTotal) {
        this.valor_total = valorTotal;
    }

    public ArrayList<ItemPedido> getItens() {
        return itens;
    }

    public void setItens(ArrayList<ItemPedido> itens) {
        this.itens = itens;
    }
}
