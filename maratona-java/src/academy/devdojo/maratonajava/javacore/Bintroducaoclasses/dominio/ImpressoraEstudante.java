package academy.devdojo.maratonajava.javacore.Bintroducaoclasses.dominio;

public class ImpressoraEstudante {
    public void imprime(Estudante estudante){
        System.out.println("=================");
        System.out.println("Nome: "+estudante.nome);
        System.out.println("Idade: "+estudante.idade);
        System.out.println("Sexo: "+estudante.sexo);
    }
}
