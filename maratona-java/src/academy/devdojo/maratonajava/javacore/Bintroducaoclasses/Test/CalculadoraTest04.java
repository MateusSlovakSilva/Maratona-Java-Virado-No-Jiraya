package academy.devdojo.maratonajava.javacore.Bintroducaoclasses.Test;

import academy.devdojo.maratonajava.javacore.Bintroducaoclasses.dominio.Calculadora;

public class CalculadoraTest04 {
    public static void main(String[] args) {
        Calculadora Calculadora = new Calculadora();
        int num1 = 1;
        int num2 = 2;
        Calculadora.alteraDoisNumeros(num1, num2);
        System.out.println("Dentro CalculadoraTest04");
        System.out.println("Num1 "+num1);
        System.out.println("Num2 "+num2);
    }
}
