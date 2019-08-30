import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        
        Scanner teclado = new Scanner(System.in);
        
        int intA, intB, intC;
        intA = teclado.nextInt();
        intB = teclado.nextInt();
        intC = teclado.nextInt();
        
        int intMaiorAB = (intA + intB + Math.abs(intA - intB)) / 2;
        int intMaiorCAB = (intMaiorAB + intC + Math.abs(intMaiorAB - intC)) / 2;
        
        System.out.println(intMaiorCAB + " eh o maior");
    }
}