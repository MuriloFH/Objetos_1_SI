package classes;

import abstratas.Pessoa;
import enuns.Especialidades;

public class Tecnico extends Pessoa{
    public double salario;
    public Especialidades especialidade;
    
    public Tecnico(){
        super();
        this.setSalario(0.00);
        this.setEspecialidade(Especialidades.C);
    }
    
    public Tecnico(String nome, String cpf, String telefone, double salario, Especialidades especialidades){
        super(nome, cpf, telefone);
        this.setSalario(salario);
        this.setEspecialidade(especialidade);
    }

    public double getSalario() {
        return salario;
    }

    public Especialidades getEspecialidade() {
        return especialidade;
    }

    public void setSalario(double salario) {
        this.salario = salario < 0.00?0.00:salario;
    }

    public void setEspecialidade(Especialidades especialidade) {
        this.especialidade = especialidade;
    }
    
    
    
}
