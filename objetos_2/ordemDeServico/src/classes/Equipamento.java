package classes;

public class Equipamento {
    private String modelo;
    private String descricao;
    private Cliente cliente;
    
    public Equipamento(){
        this.setModelo("Sem modelo");
        this.setDescricao("Sem descrição");
        this.setCliente(null);
    }
    
    public Equipamento(String modelo, String descricao, Cliente cliente){
        this.setModelo(modelo);
        this.setDescricao(descricao);
        this.setCliente(cliente);
    }

    public String getModelo() {
        return this.modelo;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public Cliente getCliente() {
        return this.cliente;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo.trim().isEmpty()? "Sem valor!":modelo.toUpperCase();;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao.trim().isEmpty()? "Sem valor!":descricao.toUpperCase();;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente==null? new Cliente():cliente;
    }

    @Override
    public String toString() {
        return modelo + ", " + descricao + ", " + cliente.getNome();
    }
    
    
    
    
}

