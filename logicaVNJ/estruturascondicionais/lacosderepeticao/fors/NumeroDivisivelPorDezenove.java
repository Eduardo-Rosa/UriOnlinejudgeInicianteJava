package logicaVNJ.estruturascondicionais.lacosderepeticao.fors;

public class NumeroDivisivelPorDezenove {
    public static void main(String[] args) {
        int x = 0;
        int y = 100000;

        for (int i = x; i < y; i++) {
            if (i % 19 == 0) {
                System.out.println("Achei um número divisível por 19 entre x e y " +i);
                break;
            }
        }
    }
}

