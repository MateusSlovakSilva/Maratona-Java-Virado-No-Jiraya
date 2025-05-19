package introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        double salario = 10000;
        String dismo = "Eu vou dizimar 1000$ ";
        String doar = "Eu vou doar 1000$ ";
        String resultado = salario > 5000 ? dismo : doar;

        System.out.println(resultado);

    }
}
