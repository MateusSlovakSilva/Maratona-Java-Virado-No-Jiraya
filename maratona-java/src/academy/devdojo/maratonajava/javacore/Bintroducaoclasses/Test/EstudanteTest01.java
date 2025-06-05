package academy.devdojo.maratonajava.javacore.Bintroducaoclasses.Test;

import academy.devdojo.maratonajava.javacore.Bintroducaoclasses.dominio.Estudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();

        estudante01.nome = "Elisa";
        estudante01.idade = 1;
        estudante01.sexo = 'F';

        estudante02.nome = "Mateus" ;
        estudante02.idade = 18;
        estudante02.sexo = 'M';

        System.out.println("nome: "+ estudante01.nome);
        System.out.println("Idade: "+ estudante01.idade);
        System.out.println("Sexo: "+ estudante01.sexo);
        System.out.println("=================");
        System.out.println("Nome: "+estudante02.nome);
        System.out.println("Idade: "+estudante02.idade);
        System.out.println("Sexo: "+estudante02.sexo);
    }
}
