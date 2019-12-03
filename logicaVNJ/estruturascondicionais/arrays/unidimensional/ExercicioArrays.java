package logicaVNJ.estruturascondicionais.arrays.unidimensional;

import java.util.Scanner;

public class ExercicioArrays {
    public static void main(String[] args) {
        int[] array1 = new int[3];
        int[] array2 = new int[3];
        int[] array3 = new int[3];

        Scanner teclado = new Scanner(System.in);
        String resultadoMultiplicacaoArrays = " ";
        for (int i = 0; i < array1.length; i++) {
            System.out.println("Vetor 1 posicao " +i+ ": ");
            array1[i] = teclado.nextInt();
            System.out.println("Vetor 2, posição " +i+ ": ");
            array2[i] =teclado.nextInt();
            array3[i] = array1[i] * array2[i];
            resultadoMultiplicacaoArrays = resultadoMultiplicacaoArrays +array3[i]+ " ";
        }
        System.out.println(resultadoMultiplicacaoArrays);
    }
}
