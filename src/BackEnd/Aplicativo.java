package BackEnd;

//import java.io.*; // import da classe File
//import java.io.IOException;

import java.util.ArrayList;
import java.util.Objects;

public class Aplicativo {

    ArrayList<Usuario> bdUsuario = new ArrayList<>();
    ArrayList<Restaurante> bdRestaurante = new ArrayList<>();

//    Aplicativo(String nome, int CPF, String endereco) {
//        this.nome = nome;
//        this.CPF = CPF;
//        this.endereco = endereco;
//    }

//    private boolean verificarExistencia (Class classeEscolhida, ArrayList lista) {
//        for (classeEscolhida : lista)
//        return true;
//    }

    public String cadastrarCliente(Usuario usuario)  {
        if (bdUsuario.size() != 0){
            for (Usuario usuarioFor : bdUsuario){
                if (Objects.equals(usuario.nome, usuarioFor.nome)){
                    return "Usuário já possui um cadastro no aplicativo";
                } else {
                    bdUsuario.add(usuario);
                    return "Usuário cadastrado com sucesso!";
                }
            }
        }else {
            bdUsuario.add(usuario);
            return "Usuário cadastrado com sucesso!";
        }
        return "";

//        OutputStream os = new FileOutputStream("teste.txt");
//        Writer wr = new OutputStreamWriter(os);
//        BufferedWriter br = new BufferedWriter(wr);

//        br.write("TESTANDO");
//        br.newLine();
//        br.write("TESTANDO BACKK");
//        br.close();

    }

    public String loginCliente(String nome) {
        for (Usuario usuario : bdUsuario){
            if (Objects.equals(usuario.nome, nome)){
                return "";
            }
        }
        return "";
    }

    public String cadastrarRestaurante(Restaurante restaurante){
        if(bdRestaurante.size() != 0){
            for (Restaurante restauranteFor : bdRestaurante){
                if (!Objects.equals(restauranteFor.nomeRestaurante, restaurante.nomeRestaurante)){
                    bdRestaurante.add(restaurante);
                    return "Restaurante cadastrado com sucesso";
                }else {
                    return "Restaurante já possui um cadastro";
                }
            }
        } else{
            bdRestaurante.add(restaurante);
            return "Restaurante cadastrado com sucesso";
        }
        return "";
    }

}
