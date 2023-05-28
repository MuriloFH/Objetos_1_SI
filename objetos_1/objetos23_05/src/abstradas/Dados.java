package abstradas;

abstract public class Dados {
    private static double cotacaoDolar;

    public static void setCotacaoDolar(double cotacaoDolar) {
        Dados.cotacaoDolar = (cotacaoDolar <= 0)?0.01:cotacaoDolar;
    }

    public static double getCotacaoDolar() {
        return cotacaoDolar;
    }
    
    
}
