package logicaVNJ.estruturascondicionais.arrays.unidimensional;

import java.util.Scanner;

public class ArraysComFors {
    public static void main(String[] args) {
        double[] notas = new double[4];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < notas.length ; i++) {
            System.out.println("Digite a nota: " + (i + 1));
            notas[i] = scanner.nextDouble();
        }

        double media = 0;
        for (int i = 0; i <notas.length ; i++) {
            media = media + notas[i];
            System.out.println("Notas " + (i + 1) + ": " + notas[i]);
        }

        media = media / notas.length;
        System.out.println("Media das notas " + media);
    }
}
