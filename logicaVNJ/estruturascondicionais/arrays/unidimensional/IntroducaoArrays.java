package logicaVNJ.estruturascondicionais.arrays.unidimensional;

public class IntroducaoArrays {
    public static void main(String[] args) {
        double[] notas = new double[4];
        System.out.println("-------------------------------");

        notas[0] = 7.5;
        notas[1] = 8.0;
        notas[2] = 3;
        notas[3] = 6;
        System.out.println("tamanho do array: " +notas.length);
        for (int i = 0; i < notas.length; i++) {
            System.out.println(notas[i]);
        }

    }
}
