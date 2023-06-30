package BackEnd;

import java.util.ArrayList;

public class Pedidos {
    Restaurante restaurante;
    Usuario usuario;
    Lanche lanche;


    public Pedidos(Restaurante restaurante, Usuario usuario, Lanche lanche) {
        this.restaurante = restaurante;
        this.usuario = usuario;
        this.lanche = lanche;
    }

    public String fazerPedido () {
        if (restaurante.getPedido().size() != 0){
            return "Pedido realizado com sucesso!";
        } else {
            return "Adicione um lanche ao carrinho";
        }
    }

    public ArrayList<Pedidos> imprimirPedido () {
        if (restaurante.getPedido().size() != 0){
            return restaurante.getPedido();
        }else {
            return null;
        }
    }

}
