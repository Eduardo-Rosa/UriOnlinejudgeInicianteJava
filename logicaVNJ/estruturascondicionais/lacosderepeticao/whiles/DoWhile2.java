package logicaVNJ.estruturascondicionais.lacosderepeticao.whiles;

import java.util.Scanner;

public class DoWhile2 {
    public static void main(String[] args) {
        int desejaContinuar = 1;
        Scanner teclado = new Scanner(System.in);
        do {
            System.out.println("Digite um número de 1 a 10");
            int num1 = teclado.nextInt();
            System.out.println("Digite um número de 1 a 10");
            int num2 = teclado.nextInt();
            System.out.println("Acertou " +(num1 == num2));
            System.out.println("------------------------------------");
            System.out.println("Deseja continuar jogando?");
            System.out.println("1-SIM");
            System.out.println("2-NÃO");
            desejaContinuar = teclado.nextInt();
        }while(desejaContinuar == 1);
    }
}
