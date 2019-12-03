package logicaVNJ.estruturascondicionais.switchcase;

public class TipoDeConta {
    public static void main(String[] args) {
        String conta ="CONTA CORRENTE";
        switch (conta){
            case "CONTA POUPANÇA":
                System.out.println("0.05%");
                break;
            case "CONTA CORRENTE":
                System.out.println("0.02%");
                break;
            case " INVESTIMENTO":
                System.out.println("0.01%");
                break;
                default:
            System.out.println("CONTA INEXISTENTE");
        }
    }
}
