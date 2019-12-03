package logicaVNJ.estruturascondicionais.variaveis;/*Criar uma classe que calcule um determinada
 porcentagem de um dado salário.
 1-Aceitar um valor de entrada para o salário
 2-Definir o valor da porcentagem(Perguntar o valor) = 30%
 3-Calcular a porcentagem
 */

public class CalculaSalario {
    public static void main(String[]args){
        float salario = 2500.00F;
        float porcentagem =20F;
        float porcentagemDoSalario = salario * (porcentagem/100);

        System.out.println(porcentagemDoSalario);
    }

}
