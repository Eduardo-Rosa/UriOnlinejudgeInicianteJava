import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        
        Scanner teclado = new Scanner(System.in);
        final double doublePi = 3.14159;
        
        int intRaio = teclado.nextInt();
        double doubleVolume = (4/3.0) * doublePi * Math.pow(intRaio, 3);
        
        System.out.printf("VOLUME = %.3f", doubleVolume);
        System.out.println();
    }
}
