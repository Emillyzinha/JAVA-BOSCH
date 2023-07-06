package BackEnd;

//import java.io.*; // import da classe File
//import java.io.IOException;

import java.util.ArrayList;
import java.util.Objects;

public class Aplicativo {

    private ArrayList<Usuario> bdUsuario = new ArrayList<>();
    private ArrayList<Restaurante> bdRestaurante = new ArrayList<>();

//    Aplicativo(String nome, int CPF, String endereco) {
//        this.nome = nome;
//        this.CPF = CPF;
//        this.endereco = endereco;
//    }

//    private boolean verificarExistencia (Class classeEscolhida, ArrayList lista) {
//        for (classeEscolhida : lista)
//        return true;
//    }


    public ArrayList<Restaurante> getBdRestaurante() {
        return bdRestaurante;
    }

    public boolean cadastrarCliente(String nome, int CPF, String endereco)  {
        if (!bdUsuario.isEmpty()){
            for (Usuario usuarioFor : bdUsuario){
                if (Objects.equals(nome, usuarioFor.nome)){
                    return false;
                } else {
                    bdUsuario.add(new Usuario(nome, CPF, endereco));
                    return true;
                }
            }
        }else {
            bdUsuario.add(new Usuario(nome, CPF, endereco));
            return true;
        }
        return false;

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

    public boolean cadastrarRestaurante(Restaurante restaurante){
        if(!bdRestaurante.isEmpty()){
            for (Restaurante restauranteFor : bdRestaurante){
                if (!Objects.equals(restauranteFor.nomeRestaurante, restaurante.nomeRestaurante)){
                    bdRestaurante.add(new Restaurante(restaurante.nomeRestaurante));
                    return true;
                }else {
                    return false;
                }
            }
        } else{
            bdRestaurante.add(new Restaurante(restaurante.nomeRestaurante));
            return true;
        }
        return false;
    }

}
