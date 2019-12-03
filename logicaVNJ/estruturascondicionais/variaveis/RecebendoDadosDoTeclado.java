package logicaVNJ.estruturascondicionais.variaveis;

import java.util.Scanner;

public class RecebendoDadosDoTeclado {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = teclado.next();
        System.out.println("Digite sua idade: ");
        String idade = teclado.next();
        System.out.println("O nome digitado foi: " + nome);
        System.out.println("A idade digitada foi: " + idade);
    }
}
