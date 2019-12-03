package logicaVNJ.estruturascondicionais.ifselse;/*
* Como secretário de alistamento militar eu gostaria que meu sistema aceitasse os seguintes parãmetros
* para que eu possa agiliza meu processo de cadastramento:
* -Sexo, sendo aceitos apenas M ou F e idade
* -Se o sexo for Masculino (M) e a idade for maior ou igual a 18 anos o sistema deve imprimir
*   **ALISTAMENTO OBRIGATÓRIO**
* -Se o sexo for Masculino (M) e a idade for menor que 18 anos o sistema deve imprimir
 *   **ALISTAMENTO NÃO PERMITIDO**
 * -Se o sexo for Feminino e a idade for maior ou igual a 18 anos o sistema deve perguntar se deseja se alistar imprimir
 *   -Se o sexo for Feminino (F) e a idade for menor que 18 anos o sistema deve imprimir
 *   **ALISTAMENTO NÃO PERMITIDO**
* */

public class AlistamentoMilitar {
    public static void main(String[] args) {
        char sexo = 'F';
        int idade = 20;

        if ((sexo == 'M' || sexo == 'F') && idade < 18) {
            System.out.println("ALISTAMENTO NÃO PERMITIDO");
        } else if (sexo == 'M' && idade >= 18) {
            System.out.println("ALISTAMENTO OBRIGATÓRIO");
        } else if (sexo == 'F' && idade >= 18) {
            System.out.println("DESEJA SE ALISTAR?");
        }
    }
}

