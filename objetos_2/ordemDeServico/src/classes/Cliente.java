package classes;

import abstratas.Pessoa;

public class Cliente extends Pessoa{
    private String endereco;
    
    public Cliente(){
       super();
       this.setEndereco("Sem endereco");
    }
    
    public Cliente(String nome, String cpf, String telefone, String endereco){
        super(nome, cpf, telefone);
        this.setEndereco(endereco);
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco.trim().isEmpty()?"Sem endereco":endereco.toUpperCase();
    }

    public String getEndereco() {
        return endereco;
    }
       
    
}
