import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException{
        
        Scanner teclado = new Scanner(System.in);
        
        int intDistTotal = teclado.nextInt();
        double doubleConsTotal = teclado.nextDouble();
        
        double doubleConsMedio = intDistTotal / doubleConsTotal;
        
        System.out.printf("%.3f km/l\n", doubleConsMedio);
    }
}