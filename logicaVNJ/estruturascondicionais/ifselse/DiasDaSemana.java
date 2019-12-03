package logicaVNJ.estruturascondicionais.ifselse;

import java.util.Scanner;

/*Receba um número inteiro do usuário e imprima o dia da semana correspondente
* Sendo 1 Segunda-Feira
*/
public class DiasDaSemana {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um número de 1 a 7: ");
        int diaDaSemana = teclado.nextInt();

        if (diaDaSemana == 1) {
            System.out.println("Segunda-Feira");
        } else if (diaDaSemana == 2) {
            System.out.println("Terça-Feira");
        } else if (diaDaSemana == 3) {
            System.out.println("Quarta-Feira");
        } else if (diaDaSemana == 4) {
            System.out.println("Quinta-Feira");
        } else if (diaDaSemana == 5) {
            System.out.println("Sexta-Feira");
        } else if (diaDaSemana == 6) {
            System.out.println("Sábado");
        } else if (diaDaSemana == 7) {
            System.out.println("Domingo");

        } else {
            System.out.println("Dia Inválido");
        }
    }
}
