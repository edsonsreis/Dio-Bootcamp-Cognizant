package programs;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double quadrado, retangulob, retanguloh;
        double trapezio_maior, trapezio_menor, trapezio_altura;
        float losango1, losango2;

        // Quadrilátero
        System.out.println("Exercício quadrilátero");
        System.out.println("Digite o lado do quadrado: ");
        quadrado = scan.nextDouble();
        System.out.println("Digite a base do retângulo: ");
        retangulob = scan.nextDouble();
        System.out.println("Digite a altura do retãngulo: ");
        retanguloh = scan.nextDouble();
        System.out.println("Digite a base Maior do Trapezio: ");
        trapezio_maior = scan.nextDouble();
        System.out.println("Digite a base Menor do Trapezio: ");
        trapezio_menor = scan.nextDouble();
        System.out.println("Digite a altura do Trapezio: ");
        trapezio_altura = scan.nextDouble();
        System.out.println("Digite a diagonal 1 do losango: ");
        losango1 = scan.nextFloat();
        System.out.println("Digite a diagonal 2 do losango: ");
        losango2 = scan.nextFloat();
        Quadrilatero.area(quadrado);
        Quadrilatero.area(retangulob,retanguloh);
        Quadrilatero.area(trapezio_maior,trapezio_menor,trapezio_altura);
        Quadrilatero.area(losango1,losango2);

    }
}
