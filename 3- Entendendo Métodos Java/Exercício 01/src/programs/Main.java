package programs;

//Classe principal dos métodos.

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        //Calculadora
        Scanner scan = new Scanner(System.in);
        double numero1, numero2;

        System.out.println("Exercício calculadora");
        System.out.println("Digite o Primeiro numero: ");
        numero1 = scan.nextDouble();
        System.out.println("Digite o Segundo numero");
        numero2 = scan.nextDouble();

        Calculadora.soma(numero1, numero2);
        Calculadora.subtracao(numero1, numero2);
        Calculadora.multiplicacao(numero1, numero2);
        Calculadora.divizao(numero1, numero2);

        //Mensagem
        System.out.println("Mensagem");
        Mensagem.obterMensagem(9);
        Mensagem.obterMensagem(14);
        Mensagem.obterMensagem(1);

        //Emprestimo
        System.out.println("Empréstimo");
        double emp1, emp2, emp3;
        int taxa1, taxa2, taxa3;

        System.out.println("Digite o valor do emprestimo 1: ");
        emp1 = scan.nextDouble();
        System.out.println("Digite o valor da primeira taxa");
        taxa1 = scan.nextInt();

        System.out.println("Digite o valor do emprestimo 2: ");
        emp2 = scan.nextDouble();
        System.out.println("Digite o valor da segunda taxa");
        taxa2 = scan.nextInt();

        System.out.println("Digite o valor do emprestimo 3: ");
        emp3 = scan.nextDouble();
        System.out.println("Digite o valor da terceira taxa");
        taxa3 = scan.nextInt();

        Emprestimo.calcular(emp1, taxa1);
        Emprestimo.calcular(emp1, taxa2);
        Emprestimo.calcular(emp1, taxa3);


    }
}
