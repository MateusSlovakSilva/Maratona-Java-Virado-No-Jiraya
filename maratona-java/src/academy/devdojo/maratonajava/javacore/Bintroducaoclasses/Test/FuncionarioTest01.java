package academy.devdojo.maratonajava.javacore.Bintroducaoclasses.Test;

import academy.devdojo.maratonajava.javacore.Bintroducaoclasses.dominio.Funcionarios;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionarios funcionario = new Funcionarios();

        funcionario.setNome("Mateus");
        funcionario.setIdade(18);
        funcionario.setSalarios(new double[]{1200, 670, 3000});

        funcionario.imprime();

    }
}
