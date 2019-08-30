import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException{
        
        Scanner teclado = new Scanner(System.in);
        
        double doubleValor = teclado.nextDouble();
        
        if (doubleValor >= 0 && doubleValor <= 25) {
            System.out.println("Intervalo [0,25]");
        } else if (doubleValor > 25 && doubleValor <= 50) {
            System.out.println("Intervalo (25,50]");
        } else if (doubleValor > 50 && doubleValor <= 75) {
            System.out.println("Intervalo (50,75]");
        } else if (doubleValor > 75 && doubleValor <= 100) {
            System.out.println("Intervalo (75,100]");
        } else {
            System.out.println("Fora de intervalo");
        }
    }
}
