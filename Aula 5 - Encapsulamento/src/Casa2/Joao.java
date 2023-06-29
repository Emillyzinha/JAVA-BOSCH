package Casa2;

import Casa1.Maria;

public class Joao extends Maria {

    void teste () {
//        System.out.println(super.segredo); //private
//        System.out.println(super.facoDentroDeCasa); //package
        System.out.println(super.familiaSabe); // super permite acessar as funções e variáveis herdadas
        System.out.println(super.todoMundoSabe);
    }
}
