package BackEnd;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Restaurante {
    String nomeRestaurante;
    private ArrayList<Lanche> cardapio = new ArrayList<>();
    private ArrayList<Pedidos> pedidos = new ArrayList<>();

    public Restaurante(String nomeRestaurante) {
        this.nomeRestaurante = nomeRestaurante;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Restaurante that = (Restaurante) o;
        return nomeRestaurante.equals(that.nomeRestaurante);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nomeRestaurante);
    }

    public String adicionarCarrinho(Restaurante restaurante, Usuario usuario, Lanche lanche) {
        pedidos.add(new Pedidos(restaurante, usuario, lanche));
        return "";
    }

    public ArrayList<Lanche> getCardapio() {
        return cardapio;
    }

    public ArrayList<Pedidos> getPedido() {
        return pedidos;
    }

    public boolean adicionarLancheCardapio(Lanche lanche) {
        if (cardapio.size() == 0){
            cardapio.add(lanche);
            return true;
        }else{
            for (Lanche lancheFor : cardapio){
                if (Objects.equals(lancheFor, lanche)){
                    return false;
                }else {
                    cardapio.add(lanche);
                    return true;
                }
            }
        }
        return false;
    }

    public String imprimirCardapio(){
        String todosLanches = "";
        String topo = "   LANCHE" +"        " + "VALOR\n";
        System.out.println(topo);
        int id = 0;
//        String idString = Integer.toString(id);
        for ( Lanche lanches : cardapio ) {
            id += 1;
            todosLanches = todosLanches.concat(lanches.nomeLanche + "         " + lanches.precoLanche + "\n");
        }
        return todosLanches;
    }

    // NÃO FUNCIONA
    public String removerLanche() {

        Scanner s = new Scanner(System.in);
        System.out.println("----------------------------------------------------------\n");
        System.out.println("Digite o ID do que lanche gostaria de remover do cardápio?\n");
        int id = s.nextInt();

            cardapio.remove(id);
            return "Lanche removido";


//        Scanner s = new Scanner(System.in);
//        System.out.println("----------------------------------------------------------\n");
//        System.out.println("Digite o ID do que lanche gostaria de remover do cardápio?\n");
//        int id = s.nextInt();
//        cardapio.remove(id);
//        String novoId = Integer.toString(id);
//        for ( Lanche lanches : cardapio ) {
//            System.out.println("here " + lanches);
//        }
//        return cardapio;
//        if (cardapioFormatado.contains(novoId)){
//            System.out.println("passei aqui");
//            id -= 1;
//            cardapio.remove(id);
//            System.out.println(cardapio);
//            imprimirCardapio();
//            System.out.println(cardapioFormatado);
//            return "return" + imprimirCardapio();
//        }else{
//            return "Lanche não existe";
        }
//    }
}
