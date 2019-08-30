import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        int intA = teclado.nextInt();
        int intB = teclado.nextInt();
        int intC = teclado.nextInt();
        int intD = teclado.nextInt();

        boolean valorValido = intB > intC && intD > intA && (intC + intD) > (intA + intB) && intC >= 0 && intD >= 0 && intA % 2 == 0;
        
        if (valorValido) {
            System.out.println("Valores aceitos");
        } else {
            System.out.println("Valores nao aceitos");
        }
    }
}