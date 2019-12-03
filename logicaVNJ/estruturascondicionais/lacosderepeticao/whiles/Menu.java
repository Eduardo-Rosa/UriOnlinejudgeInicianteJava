/*
* Como usuário eu gostaria de ter um menu visual que seja navegável através de números.
* O menu deve ser exibido da seguinte forma
*
* 1- Calcula imposto
* 2- Depositar salário
* 3- Sair
*
* O menu deve ficar disponível enquanto eu não digitar o número 3.
* Dessa forma o sistema ficará em execução, evitando ter que ser reiniciado a cada operação.
* */
package logicaVNJ.estruturascondicionais.lacosderepeticao.whiles;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        int opcao = 0;
        Scanner teclado = new Scanner(System.in);
        while (opcao != 3) {
            System.out.println("1 - Calcula imposto");
            System.out.println("2 - Depositar salario");
            System.out.println("3 - Sair");
            System.out.println("Digite a sua opção");
            opcao = teclado.nextInt();
        }
        System.out.println("O programa esta sendo encerrado!");
    }

}
