package introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        // + - / *
        int n1 = 10;
        int n2 = 20;
        double resultado = n1 + (double)n2;
        System.out.println(resultado);

        // resto %,
        int resto = 21 & 7;
        System.out.println(resto);

        // maior >, menor <, menor igual <=, maior igual >=, igual ==, diferente !=
        boolean DezeMaiorQueVinte = 10 > 20;
        boolean DezeMenorQueVinte = 10 < 20;
        boolean DezeIgualQueVinte = 10 == 20;
        boolean DezeIgualDez = 10 == 10;
        boolean DezeDiferentedeDez = 10 != 10;
        System.out.println(DezeMaiorQueVinte);
        System.out.println(DezeMenorQueVinte);
        System.out.println(DezeIgualQueVinte);
        System.out.println(DezeIgualDez);
        System.out.println(DezeDiferentedeDez);

        // (&& (AND)) (|| (OR)) (! (NOT))

        int idade = 35;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorQueTrinta = idade > 30 && salario >= 4612;
        boolean isDentroDaleiMenorQueTrinta = idade < 30 && salario >= 3381;
        System.out.println("isDentroDaLeiMaiorQueTrinta "+isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaleiMenorQueTrinta "+isDentroDaleiMenorQueTrinta);

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 3000;
        float valorPlaystation = 5000F;

        boolean isPlaystationCincoCompravel = valorTotalContaCorrente > valorPlaystation || valorTotalContaPoupanca > valorPlaystation;
        System.out.println("isPlaystationCincoCompravel "+isPlaystationCincoCompravel);

        // = += -= /= %=
        double bonus = 1800;
        bonus += + 1000;
        bonus -= + 1000;
        bonus *= + 2;
        bonus /= + 2;
        bonus %= + 2;
        System.out.println(bonus);

        //
        int contador = 0;
        contador += 1;
        contador++;
        contador--;
        ++contador;
        --contador;
        int contador2 = 0;
        System.out.println(contador2);

    }
}
