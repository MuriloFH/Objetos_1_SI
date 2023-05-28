package abstracts;

abstract public class Dados_abstratos {

    private static int horasMes = 0;

    public static void setHorasMes(int horasMes) {
        Dados_abstratos.horasMes = (horasMes > 220) ? 220 : horasMes;
    }

    public static int getHorasMes() {
        return horasMes;
    }

    public static double getDescontoINSS(double salario) {
        if (salario <= 1320.00) {
            salario = salario - (salario * 0.075);
        } else if (salario > 1320.00 && salario <= 2571.29) {
            salario = salario - (salario * 0.09);
        } else if (salario > 2571.30 && salario <= 3856.94) {
            salario = salario - (salario * 0.12);
        } else {
            salario = salario - (salario * 0.14);
        }
        return salario;
    }

    public static double getDescontoIRRF(double salario) {
        if (salario <= 2112.00) {
            return salario;
        } else if (salario > 2112.00 && salario <= 2826.65) {
            salario = salario - (salario * 0.075);
        } else if (salario > 2826.65 && salario <= 3751.05) {
            salario = salario - (salario * 0.15);
        } else if (salario > 3751.05 && salario <= 4664.68) {
            salario = salario - (salario * 0.225);
        } else {
            salario = salario - (salario * 0.275);
        }
        return salario;
    }

}
