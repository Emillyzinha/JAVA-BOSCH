package BackEnd;

public class Pedidos {
    Restaurante restaurante;
    Usuario usuario;

    public Pedidos(Restaurante restaurante, Usuario usuario) {
        this.restaurante = restaurante;
        this.usuario = usuario;
    }

    public String fazerPedido () {
        System.out.println(restaurante.cardapio.size() + " oi");
        return "foi";
//        if(restaurante.cardapio.size() != 0){
//            restaurante.cardapio.clear();
//            return "Pedido realizado com sucesso!";
//        }else{
//            return "Adicione um lanche ao carrinho antes.";
//        }

    }
}
