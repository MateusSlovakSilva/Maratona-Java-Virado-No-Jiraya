package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro01 = new Carro();
        Carro carro02 = new Carro();

        carro01.nome = "ferrari";
        carro01.modelo = "Italia";
        carro01.ano = 2025;

        carro02.nome = "Senna";
        carro02.modelo = "Ford";
        carro02.ano = 2025;

        System.out.println("|====================================|");
        System.out.println("| Nome:"+carro01.nome+" modelo:"+carro01.modelo+" ano:"+carro01.ano+"|");
        System.out.println("|====================================|");
        System.out.println("| Nome:"+carro02.nome+" modelo:"+carro02.modelo+" ano:"+carro02.ano+"    |");
        System.out.println("|====================================|");
    }

}
