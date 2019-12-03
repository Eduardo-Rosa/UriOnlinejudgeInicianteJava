package logicaVNJ.estruturascondicionais.ifselse;/*
 * Eu, como administrador de um sistema, gostaria de permitir que os próprios usuários
 *  cadatrassem o nome de usuário(Login) no sistema para agilizar
 * o processo de migração do sistema antigo para o novo.
 *O usuário não pode deixar o login vazio "", ou criar ou usuário com login "admin" ou "administrador".
 * Se o valor entrado for válido o sistema deverá exibir uma mensagem "<nome do usuário> cadastrado com sucesso"
 * senão o sistema deverá mostrar o erro "Usuário Inválido"
 */


import java.util.Scanner;

public class CadastroDeLogin {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Digite seu nome de usuário: ");
        String nome = input.next();

        if ( nome.isBlank() || nome.isEmpty() || nome.equalsIgnoreCase("admin")
                || nome.equalsIgnoreCase("administrador")){
            System.out.println("Usuário Inválido");
        }else {
            System.out.println(nome+ "Cadastrado com sucesso");
        }
    }
}
