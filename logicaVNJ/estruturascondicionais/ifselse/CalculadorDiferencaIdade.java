package logicaVNJ.estruturascondicionais.ifselse;

public class CalculadorDiferencaIdade {
    public static void main(String[]args){
        int FirstAge = 40;
        int secundAge = 80;
        int ageDifference = FirstAge - secundAge;
        int ageDifferenceNegative = ageDifference * -1;

        if (ageDifference >1){
            System.out.println("A diferença de idade é " + ageDifference);
        }else {
            System.out.println("A diferença de idade é de " +ageDifferenceNegative);
        }
    }
}
