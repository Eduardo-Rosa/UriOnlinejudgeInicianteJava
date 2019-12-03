package logicaVNJ.estruturascondicionais.ifselse;/*
* Receba uma idade como entreda
* Se idade for maior ou igual que 18 imprima "Adulto"
* Senão imprima "Ainda não é adulto"
* */

public class VerificaIdade {
    public static void main(String[] args) {
        var idade = 19;
                if(idade >= 18){
                    System.out.println("Adulto");
                }else {
                    System.out.println("Ainda não é adulto");
                }
    }
}
