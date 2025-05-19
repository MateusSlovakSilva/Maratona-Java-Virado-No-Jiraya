package introducao;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {
        int idade = 16;
        boolean temIdadeParaBeber = idade >= 18;

        if (temIdadeParaBeber != false) {
            System.out.println("Tem idade para Beber");
        }else{
            System.out.println("nao tem idade para beber");
        }

    }
}
