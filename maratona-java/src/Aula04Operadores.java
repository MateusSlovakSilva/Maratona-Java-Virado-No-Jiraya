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
    }
}
