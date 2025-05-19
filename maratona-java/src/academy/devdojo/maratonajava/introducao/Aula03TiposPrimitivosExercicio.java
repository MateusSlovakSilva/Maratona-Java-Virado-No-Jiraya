package academy.devdojo.maratonajava.introducao;/*
Prática

Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:
Eu <nome>, morando no endereço <endereço>,
confirmo que recebi o salário de <salario>, na data <data>
*/

public class Aula03TiposPrimitivosExercicio {
    public static void main(String[] args) {

        String Nome = "Mateus Slovak";
        String Endereco = "Rua Felipe dos Santos";
        double Salario = 1500.00;
        String DataRecibimento = "22/04/2025";
        String Relatorio = ("Eu " + Nome+ ", morando no endereço "+Endereco+", confirmo que recebi o salário "+Salario+", na data "+DataRecibimento);

        System.out.println(Relatorio);
    }
}


