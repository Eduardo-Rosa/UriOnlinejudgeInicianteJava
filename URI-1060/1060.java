import java.io.IOException;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) throws IOException {
        Scanner teclado = new Scanner(System.in);
        
        double doubleNum[] = new double[6];
        
        int intContagem = 0;
        for (int i = 0; i < doubleNum.length; i++) {
            doubleNum[i] = teclado.nextDouble();
            if (doubleNum[i] > 0) intContagem++;
        }
        System.out.println(intContagem + " valores positivos");
    }
}