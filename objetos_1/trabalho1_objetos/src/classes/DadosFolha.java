package classes;

public final class DadosFolha {

    private String nomeFunc;
    private String competencia;
    private String tipoProcessamento;
    private String subTipoProcessamento;
    private double salarioContratual;
    private boolean faltas;
    private int horasFaltas;

    //construtor
    public DadosFolha(String nomeFunc, String competencia, String tipoProcessamento, String subTipoProcessamento, double salarioContratual, boolean faltas, int horasFaltas) {
        this.setNomeFunc(nomeFunc);
        this.setCompetencia(competencia);
        this.setTipoProcessamento(tipoProcessamento);
        this.setSubTipoProcessamento(subTipoProcessamento);
        this.setSalarioContratual(salarioContratual);
        this.setFaltas(faltas);
        this.setHorasFaltas(horasFaltas);
    }

    //getters
    public String getNomeFunc() {
        return this.nomeFunc;
    }

    public String getCompetencia() {
        return this.competencia;
    }

    public String getTipoProcessamento() {
        return tipoProcessamento;
    }

    public String getSubTipoProcessamento() {
        return subTipoProcessamento;
    }

    public double getSalarioContratual() {
        return this.salarioContratual;
    }

    public boolean isFaltas() {
        return this.faltas;
    }

    public int getHorasFaltas() {
        return this.horasFaltas;
    }

    //setters
    public void setNomeFunc(String nomeFunc) {
        this.nomeFunc = nomeFunc.trim().isEmpty() ? "aiii" : nomeFunc.toUpperCase();
    }

    public void setCompetencia(String competencia) {
        this.competencia = competencia.trim().isEmpty() ? "01/1800" : competencia.toUpperCase();
    }

    public void setTipoProcessamento(String tipoProcessamento) {
        this.tipoProcessamento = tipoProcessamento;
    }

    public void setSubTipoProcessamento(String subTipoProcessamento) {
        this.subTipoProcessamento = subTipoProcessamento;
    }

    public void setSalarioContratual(double salarioContratual) {
        this.salarioContratual = salarioContratual;
    }

    public void setFaltas(boolean faltas) {
        this.faltas = faltas;
    }

    public void setHorasFaltas(int horasFaltas) {
        this.horasFaltas = horasFaltas;
    }

}
