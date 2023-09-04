package abstratas;

import classes.Cliente;
import classes.Equipamento;
import classes.Servico;
import classes.Tecnico;
import java.util.LinkedList;

abstract public class Dados {
    private static LinkedList<Cliente> listaCliente = new LinkedList<>();
    private static LinkedList<Tecnico> listaTecnico = new LinkedList<>();
    private static LinkedList<Equipamento> listaEquipamento = new LinkedList<>();
    private static LinkedList<Servico> listaServico = new LinkedList<>();
    
    public static LinkedList<Cliente> getListaCliente() {
        return listaCliente;
    }
    
    public static LinkedList<Tecnico> getListaTecnico() {
        return listaTecnico;
    }
    
    public static LinkedList<Equipamento> getListaEquipamento() {
        return listaEquipamento;
    }
    
    public static LinkedList<Servico> getListaServico() {
        return listaServico;
    }
}
