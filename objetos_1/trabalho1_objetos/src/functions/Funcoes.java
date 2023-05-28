package functions;

public class Funcoes {

    public static double calculaSalario(double salario, int horaFalta) {

        int horaMes = abstracts.Dados_abstratos.getHorasMes();

        salario = salario / horaMes;

        if (horaFalta > 0) {
            salario *= (horaMes - horaFalta);
        } else {
            salario *= horaMes;
        }

        salario = getDescontoINSS(salario);

        salario = getDescontoIRRF(salario);

        return Math.round(salario);
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
