package logicaVNJ.estruturascondicionais.lacosderepeticao.fors;

public class EntreCinquentaESessenta {
    public static void main(String[] args) {

        for (int i = 0; i < 100; i++){
            if (i > 30&& i < 80 ){
                continue;
            }
            System.out.println(i);
        }
    }
}
