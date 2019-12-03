package logicaVNJ.estruturascondicionais.lacosderepeticao.whiles;

public class DoWhile {
    public static void main(String[] args) {
        boolean condicao = false;
        while (condicao) {
            System.out.println("Dentro do While");
        }
        do {
            System.out.println("dentro do do-while");
        }while (condicao);
    }
}
