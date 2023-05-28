package abstracts;

abstract public class Dados_abstratos {

    private static int horasMes = 0;

    public static void setHorasMes(int horasMes) {
        Dados_abstratos.horasMes = (horasMes > 220) ? 220 : horasMes;
    }

    public static int getHorasMes() {
        return horasMes;
    }

}
