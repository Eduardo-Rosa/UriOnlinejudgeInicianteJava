import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner teclado = new Scanner(System.in);
        int intDdd = teclado.nextInt();
        
        String strCidade = "";
        switch (intDdd) {
            case 11:
                strCidade = "Sao Paulo";
                break;
            case 19:
                strCidade = "Campinas";
                break;
            case 21:
                strCidade = "Rio de Janeiro";
                break;
            case 27:
                strCidade = "Vitoria";
                break;
            case 31:
                strCidade = "Belo Horizonte";
                break;
            case 32:
                strCidade = "Juiz de Fora";
                break;
            case 61:
                strCidade = "Brasilia";
                break;
            case 71:
                strCidade = "Salvador";
                break;
            
            default:
                strCidade = "DDD nao cadastrado";
        }
        
        System.out.println(strCidade);
    }
}
