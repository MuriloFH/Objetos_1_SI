package classes;

public class Pessoa {
    //toda class é composta por atributos e métodos
    
    //atributos{
    private String nome;
    private int idade;
    private char sexo;
    private String profissao;
    
    //}
    
    //métodos{
        //construtores
    public Pessoa(){
        this.setNome("");
        this.setIdade(787);
        this.setSexo('A');
        this.setProfissao("");
    }
    
    public Pessoa(String nome, int idade, char sexo, String profissao){
        setNome(nome);
        setIdade(idade);
        setProfissao(profissao);
        setSexo(sexo);
        
    }
    //quando tem mais de um metodo igual, porem com parametros diferente é chamado de sobrecarga de assinatura
        //atribuição(set)
    public void setNome(String nome){
        this.nome = nome.trim().isEmpty()?"NaN":nome.toUpperCase();
    }
    
    public void setIdade (int idade){
        this.idade = ((idade < 0)||(idade > 150))? 0 : idade;
    }
    
    public void setSexo(char sexo){
        this.sexo = ((sexo != 'M') || (sexo != 'F'))?'O':sexo;
    }
    
    public void setProfissao(String profissao){
        this.profissao = profissao.trim().isEmpty()?"NaN":profissao.toUpperCase();
    }
        //retorno(get)
    public String getNome(){
        return this.nome;
    }
    
    public int getIdade(){
        return this.idade;
    }
    
    public char getSexo(){
        return this.sexo;
    }
    
    public String getProfissao(){
        return this.profissao;
    }
        //retorno boolean (is)
        //toString()
    
    
    //}
}
