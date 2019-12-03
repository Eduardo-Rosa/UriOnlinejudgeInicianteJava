package logicaVNJ.estruturascondicionais.ifselse;/*
* Dado determinado numero inteiro,
* mostre na tela se este número é par ou impar.
* */

public class ImparOuPar {
    public static void main(String[] args) {
        int numero = 3812;
        if (numero %2 == 0) {
            System.out.println("Este número é par");
        }else{
            System.out.println("Este numero é impar");
        }
    }
}
