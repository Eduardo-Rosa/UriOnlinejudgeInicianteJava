package logicaVNJ.estruturascondicionais.variaveis;/*
* Crie uma variável que irá guardar o valor de um salário
* Calcule a porcentagem desse salário, sendo os valores da porcentagem:
* 30%
* 15%
* 5%
* A cada vez que calcular guarde o valor em uma variável
* Imprima o resultado e reutilize a variável que guarda o resultado
* para o novo cálculo,repetindo o processo.
* */

public class ReutilizandoVariavel {

    public static void main(String[] args){
        double salario = 5000;
        double resultado = salario *0.3;
        System.out.println("30% eh: " +resultado);
        resultado = salario * 0.15;
        System.out.println("15% eh:" +resultado );
        resultado = salario *0.05;
        System.out.println("5% eh:" +resultado);
    }
}
