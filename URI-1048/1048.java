import java.io.IOException;
import java.util.Scanner;

public class Main {
     
    public static void main(String[] args) throws IOException{
        Scanner teclado = new Scanner(System.in);
        
        double doubleSalario = teclado.nextDouble();
        double doubleReajuste = 0;
        int intPercentualReajuste;
        
        
        if (doubleSalario > 0 && doubleSalario <= 400) {
            doubleReajuste = doubleSalario * 0.15;
            intPercentualReajuste = 15;
        } else if (doubleSalario <= 800) {
            doubleReajuste = doubleSalario * 0.12;
            intPercentualReajuste = 12;
        } else if (doubleSalario <= 1200) {
            doubleReajuste = doubleSalario * 0.10;
            intPercentualReajuste = 10;
        } else if (doubleSalario <= 2000) {
            doubleReajuste = doubleSalario * 0.07;
            intPercentualReajuste = 7;
        } else {
            doubleReajuste = doubleSalario * 0.04;
            intPercentualReajuste = 4;
        }
        
        System.out.printf("Novo salario: %.2f\n", (doubleSalario + doubleReajuste));
        System.out.printf("Reajuste ganho: %.2f\n", doubleReajuste);
        System.out.println("Em percentual: " + intPercentualReajuste + " %"); 
    }
}