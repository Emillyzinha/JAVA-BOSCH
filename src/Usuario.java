public class Usuario {

    private int idade;
    private String nome;
    private final int teste = 20; // ninguém consegue alterar
    public int getIdade(){
        return idade;
    }

    public void setIdade(int idade){
        idade = Math.abs(idade); // transforma de número negativo para positivo
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override // tá sobreescrevendo os atributos da classe transformando a idade em string
    public String toString(){ // retorna uma string
        return "Meu nome é " + this.nome + " e eu tenho " + this.idade + " anos";
    }

}
