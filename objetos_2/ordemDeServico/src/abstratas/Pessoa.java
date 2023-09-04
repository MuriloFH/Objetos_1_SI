package abstratas;

abstract public class Pessoa {
    private String nome;
    private String cpf;
    private String telefone;
    
    
    public Pessoa(){
        this.setCpf("000.000.00-00");
        this.setNome("Nome vazio");
        this.setTelefone("00-00000-0000");
    }

    public Pessoa(String nome, String cpf, String telefone) {
        this.setNome(nome);
        this.setCpf(cpf);
        this.setTelefone(telefone);
    }

    public String getNome() {
        return this.nome;
    }

    public String getCpf() {
        return this.cpf;
    }

    public String getTelefone() {
        return this.telefone;
    }

    public void setNome(String nome) {
        this.nome = nome.trim().isEmpty()? "Nome vazio!":nome.toUpperCase();
    }

    public void setCpf(String cpf) {
        this.cpf = cpf.trim().isEmpty()? "000.000.00-00":cpf;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone.trim().isEmpty()? "00-00000-0000":telefone;
    }

    @Override
    public String toString() {
        return nome + " | "+cpf;
    }
    
    
    
    
}
