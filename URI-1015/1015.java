import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner teclado = new Scanner(System.in);
        
        double doubleX1, doubleY1, doubleX2, doubleY2;
        
        doubleX1 = teclado.nextDouble();
        doubleY1 = teclado.nextDouble();
        doubleX2 = teclado.nextDouble();
        doubleY2 = teclado.nextDouble();
        
        double doubleDistancia = Math.sqrt(Math.pow((doubleX2 - doubleX1), 2) + Math.pow((doubleY2 - doubleY1), 2));
        
        System.out.printf("%.4f\n", doubleDistancia);
    }
}