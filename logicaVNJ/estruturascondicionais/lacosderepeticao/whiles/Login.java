package logicaVNJ.estruturascondicionais.lacosderepeticao.whiles;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        final String login = "Luffy";
        final String pass = "CavaleiroJedi";
        boolean exibirTelaLogin = true;
        Scanner teclado = new Scanner (System.in);
        while(exibirTelaLogin){
            System.out.println("Digite seu Login");
            String loginDigitado = teclado.nextLine();
            System.out.println("digite sua senha");
            String passDigitado = teclado.nextLine();
            if(login.equals(loginDigitado) && pass.equals(passDigitado)) {
                System.out.println("ACESSO CONCEDIDO");
                exibirTelaLogin = false;
                break;
            }
                System.out.println("ACESSO NEGADO");
        }
        System.out.println("PROGRAMA TERMINADO");
    }
}
