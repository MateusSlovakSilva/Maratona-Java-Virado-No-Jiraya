package academy.devdojo.maratonajava.javacore.Bintroducaoclasses.Test;

import academy.devdojo.maratonajava.javacore.Bintroducaoclasses.dominio.Estudante;
import academy.devdojo.maratonajava.javacore.Bintroducaoclasses.dominio.ImpressoraEstudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        ImpressoraEstudante impressora = new ImpressoraEstudante();

        estudante01.nome = "Elisa";
        estudante01.idade = 1;
        estudante01.sexo = 'F';

        estudante02.nome = "Mateus" ;
        estudante02.idade = 18;
        estudante02.sexo = 'M';

        impressora.imprime(estudante01);

        impressora.imprime(estudante02);

        System.out.println("###########");

        impressora.imprime(estudante01);

        impressora.imprime(estudante02);
    }
}
