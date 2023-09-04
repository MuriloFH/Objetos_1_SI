package classes;

import enuns.StatusServico;
import java.time.LocalDate;

public class Servico{
    private LocalDate data;
    private Equipamento equipamento;
    private Tecnico tecnico;
    private String observacao;
    private StatusServico statusServico;
    
    public Servico(){
        this.setData(null);
        this.setEquipamento(null);
        this.setTecnico(null);
        this.setObservacao("nenhuma");
        this.setStatusServico(statusServico.AB);
    }

    public Servico(LocalDate data, Equipamento equipamento, Tecnico tecnico, String observacao, StatusServico statusServico) {
        this.setData(data);
        this.setEquipamento(equipamento);
        this.setTecnico(tecnico);
        this.setObservacao(observacao);
        this.setStatusServico(statusServico);
    }

    
    
    public void setData(LocalDate data) {
        this.data = data == null? LocalDate.now():data;
    }

    public void setEquipamento(Equipamento equipamento) {
        this.equipamento = equipamento == null?new Equipamento():equipamento;
    }

    public void setTecnico(Tecnico tecnico) {
        this.tecnico = tecnico == null?new Tecnico():tecnico;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao.trim().isEmpty()? "Nenhuma": observacao.toUpperCase();
    }

    public void setStatusServico(StatusServico statusServico) {
        this.statusServico = statusServico;
    }

    public LocalDate getData() {
        return data;
    }

    public Equipamento getEquipamento() {
        return equipamento;
    }

    public Tecnico getTecnico() {
        return tecnico;
    }

    public String getObservacao() {
        return observacao;
    }

    public StatusServico getStatusServico() {
        return statusServico;
    }

    @Override
    public String toString() {
        return data + "," + equipamento + ", " + tecnico + ", " + observacao + ", " + statusServico;
    }
    
    
    
    
}
