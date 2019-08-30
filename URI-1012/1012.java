import java.io.IOException;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args)throws IOException {
        
        Scanner teclado = new Scanner(System.in);
        
        final double doublePi = 3.14159;
        double doubleA = teclado.nextDouble();
        double doubleB = teclado.nextDouble();
        double doubleC = teclado.nextDouble();

        double doubleAreaTriangulo = (doubleA * doubleC) / 2;
        double doubleAreaCirculo = doublePi * Math.pow(doubleC, 2);
        double doubleAreaTrapezio = ((doubleA + doubleB) * doubleC) / 2;
        double doubleAreaQuadrado = doubleB * doubleB;
        double doubleAreaRetangulo = doubleA * doubleB;

        System.out.printf("TRIANGULO: %.3f\n", doubleAreaTriangulo);
        System.out.printf("CIRCULO: %.3f\n", doubleAreaCirculo);
        System.out.printf("TRAPEZIO: %.3f\n", doubleAreaTrapezio);
        System.out.printf("QUADRADO: %.3f\n", doubleAreaQuadrado);
        System.out.printf("RETANGULO: %.3f\n", doubleAreaRetangulo);
    }
}