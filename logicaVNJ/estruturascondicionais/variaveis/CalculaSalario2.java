package logicaVNJ.estruturascondicionais.variaveis;

public class CalculaSalario2 {
    public static void main(String[] args) {
        float salario = 4500.00F;
        float trinta = salario*0.3F;
        float quinze = salario*0.15F;
        if (salario< 5500.00){
            System.out.println("O valor do salario é R$ " +salario+ "e 30% corresponde a " +trinta );
    }else {
            System.out.println("O valor do salario é R$ " + salario + "e 15% corresponde a " + quinze);
        }
    }
}
