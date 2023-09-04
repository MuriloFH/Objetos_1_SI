package enuns;

public enum StatusServico {
    AB("Aberto"),
    AP("Aguardando peças"),
    EE("Em execução"),
    FI("Finalizado");
    
    
    private String descricao;

    private StatusServico(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return descricao;
    }
        
    
}
