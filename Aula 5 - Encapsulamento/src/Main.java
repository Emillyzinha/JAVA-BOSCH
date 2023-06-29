// PRIVATE = só acessa na própria classe
// PACKAGE(DEFAULT) = acessa as classes do pacote
// PORTECD = tem que ter uma relação de herança para acessar
// PUBLIC = public

public class Main {
    public static void main(String[] args) {
        Usuario usuario = new Usuario();
        usuario.setIdade(18);
        usuario.setNome("Emilly");
        System.out.println(usuario);
    }
}
