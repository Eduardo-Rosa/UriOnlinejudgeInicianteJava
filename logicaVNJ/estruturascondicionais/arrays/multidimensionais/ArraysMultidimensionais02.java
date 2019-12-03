package logicaVNJ.estruturascondicionais.arrays.multidimensionais;

public class ArraysMultidimensionais02 {
    public static void main(String[] args) {
        int [] [] arrayMulti1 = new int[2][3];
        arrayMulti1 [0][0] = 22;
        arrayMulti1 [0][1] = 11;
        arrayMulti1 [0][2] = 54;
        arrayMulti1 [1][0] = 44;
        arrayMulti1 [1][1] = 56;
        arrayMulti1 [1][2] = 55;
        for (int i = 0; i < arrayMulti1.length ; i++) {
            for (int j = 0; j < arrayMulti1[i].length ; j++) {
                System.out.println("["+i+"]["+j+"]" +arrayMulti1 [i] [j]);
            }
        }
    }
}
