import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        int intCodPeca1, intCodPeca2, intNumPeca1, intNumPeca2;
        
        double doubleValorUnitPeca1, doubleValorUnitPeca2;
        
        intCodPeca1 = teclado.nextInt();
        intNumPeca1 = teclado.nextInt();
        
        doubleValorUnitPeca1 = teclado.nextDouble();
        
        intCodPeca2 = teclado.nextInt();
        intNumPeca2 = teclado.nextInt();
        
        doubleValorUnitPeca2 = teclado.nextDouble();
        
        double doubleValorPagar = (doubleValorUnitPeca1 * intNumPeca1) +
        (doubleValorUnitPeca2 * intNumPeca2);
        
        System.out.printf("VALOR A PAGAR: R$ %.2f", doubleValorPagar);
        System.out.println();
    }
}