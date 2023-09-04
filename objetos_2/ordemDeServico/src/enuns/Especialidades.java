package enuns;

public enum Especialidades {
    C("CELULAR"),
    N("NOTEBOOK"),
    I("IMPRESSORA"),
    D("DESKTOP"),
    S("SERVIDOR");
    
    private String descricao;

    private Especialidades(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return this.descricao;
    }
    
    
}
