

/*
* Gostaria que um sistema fizesse automaticamente a tabuada de 1 à 10
* */
package logicaVNJ.estruturascondicionais.lacosderepeticao.fors;

public class Tabuada {
    public static void main(String[] args) {
        for (int i = 1; i <= 10 ; i++) {
            System.out.println("Fazendo tabuada do número " +i);
            for (int j = 1; j <= 10 ; j++) {
                System.out.println(i + " X " +j);
            }
        }
    }
}
