package professor2;
public class Main {
    public static void main(String[] args) throws Exception {

        Produto produto1 = new Produto(6374, 39.7, "Livro o sol é para todos, Harpper Lee");
        Produto produto2 = new Produto(9807, 56.9, "Livro Mahlala, Mahlala");

        ItemPedido itemPedido1 = new ItemPedido(produto1, 3);
        ItemPedido itemPedido2 = new ItemPedido(produto2, 6);

        Pedido pedido = new Pedido();

        pedido.adicionarItem(itemPedido1);
        pedido.adicionarItem(itemPedido2);

        System.out.println("Descição do pedido:");
        pedido.imprimirItens();
        System.out.println("\nO valor total do pedido é: R$"+pedido.getValorTotal());

    }
}
