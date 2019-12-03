package logicaVNJ.estruturascondicionais.ifselse;/*
* Eu como usuário gostaria de ter o nome e a idade de participantes
* de um torneio de nataçãoe que o sistema imprimisse da seguinte forma
* Menor que 10 anos: <NOME> participará da categoria Infântil
* Entre 11 e 15 anos: <NOME> participará da categoria Juvenil
* Entre 16 e 19 anos: <NOME> participará da categoria Pré-Adulto
* Acima de 20 anos: <NOME> participará da categoria Adulto
* Para que eu possa rapidamente classificar todos os participantes
*
* ******LEITURA COMPLEMENTAR********
* Processos de desenvolvimento de Software
* Metodologias Ágeis
* SCRUM
* */

import java.util.Scanner;

public class TorneioDeNatacao {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o seu nome: ");
        String nome = input.next();
        System.out.println("Digite a sua idade: ");
        int idade = input.nextInt();

        if (idade <= 10){
            System.out.println(" O atleta " +nome+ " participará da categoria Infantil");
        } else if (idade >= 11 && idade <= 15) {
            System.out.println(" O atleta " + nome + " participará da categoria Juvenil");
        } else if (idade >= 16 && idade <= 19) {
            System.out.println(" O atleta " + nome + " participará da categoria Pré-Adulto");
        } else{
            System.out.println(" O atleta " + nome + " participará da categoria Adulto");
        }
    }
}
