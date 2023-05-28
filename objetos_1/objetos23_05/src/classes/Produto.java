package classes;

import abstradas.Dados;


public final class Produto {
    //atributos
    private String nome;
    private String unidade;
    private double preco;
    private boolean nacional;
    
    public Produto(){
        this.setNome("sem nome");
        this.setUnidade("UN");
        this.setPreco(0.01);
        this.setNacional(true);
    }

    public Produto(String nome, String unidade, double preco, boolean nacional) {
        this.setNome(nome);
        this.setUnidade(unidade);
        this.setPreco(preco);
        this.setNacional(nacional);
    }

    public void setNome(String nome) {
        this.nome = nome.trim().isEmpty()?"NaN":nome.toUpperCase();;
    }

    public void setUnidade(String unidade) {
        this.unidade = unidade.trim().isEmpty()?"NaN":unidade.toUpperCase();;
    }

    public void setPreco(double preco) {
        this.preco = (preco <= 0)?0.01:preco;
    }

    public void setNacional(boolean nacional) {
        this.nacional = nacional;
    }

    public String getNome() {
        return this.nome;
    }

    public String getUnidade() {
        return this.unidade;
    }

    public double getPreco() {
        return this.preco;
    }

    public double getPrecoVenda(){
        return (this.isNacional()? this.preco : this.preco * Dados.getCotacaoDolar());
    }
    
    public boolean isNacional() {
        return this.nacional;
    }

    @Override
    public String toString() {
        return this.nome;
    }
    
    
    
    
    
    
}
