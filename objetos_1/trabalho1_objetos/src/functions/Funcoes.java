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

        salario = abstracts.Dados_abstratos.getDescontoINSS(salario);

        salario = abstracts.Dados_abstratos.getDescontoIRRF(salario);

        return Math.round(salario);
    }
}
