import java.io.IOException;
import java.util.Scanner;
  
public class Main {
  
    public static void main(String[] args) throws IOException {
  
        Scanner teclado = new Scanner(System.in);
 
    long longX, longY, longSoma;
    while (teclado.hasNext()) {
        longX = teclado.nextLong();
        longY = teclado.nextLong();
        longSoma = longX^longY;
        System.out.println(longSoma);
        }
  
    }
  
}