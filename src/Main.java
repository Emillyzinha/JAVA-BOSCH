import BackEnd.Aplicativo;
import BackEnd.Lanche;
import BackEnd.Pedidos;
import BackEnd.Restaurante;
import BackEnd.Usuario;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Aplicativo aplicativo = new Aplicativo();
        Usuario usuario = new Usuario("Emilly", 12, "Libania");

        Restaurante restaurante = new Restaurante("Teste", "Teste");
        Pedidos pedido = new Pedidos(restaurante, usuario, new Lanche("XTudo", 12.30));

        restaurante.adicionarLancheCardapio(new Lanche("XTudo", 12.30));
        restaurante.adicionarLancheCardapio(new Lanche("XNada", 15.00));
        restaurante.adicionarLancheCardapio(new Lanche("XSalada", 19.60));

//        while (true){
        System.out.println(restaurante.imprimirCardapio());
        System.out.println(restaurante.adicionarCarrinho(restaurante, usuario, new Lanche("XTudo", 12.30)));

        System.out.println("oi " + restaurante.getPedido());
        System.out.println("imprimir " + pedido.imprimirPedido());
        System.out.println("fazer " +pedido.fazerPedido());
//
//            System.out.println(restaurante.removerLanche());
//
//            System.out.println(restaurante.imprimirCardapio());
//        }

//        Pedidos pedidos = new Pedidos(restaurante, new Usuario("Teste", 12, "oi"));




//        System.out.println(pedidos.fazerPedido());

    }
}
