package projetovendas.controller;

import projetovendas.interfaces.IOperacao;
import projetovendas.model.Cidade;
import projetovendas.model.Estado;

/**
 *
 * @author surfa
 */
public class EstadoController implements IOperacao{

    public static String getEstado() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
       private Estado estado;

    @Override
    public void cadastrar() {
       estado.cadastrar();
    }

    @Override
    public boolean alterar() {
        return false;
    }

    @Override
    public boolean excluir() {
        estado = null;
        return true;
    }

    @Override
    public void cancelar() {
    }

    public Estado getCidade() {
        return estado;
    }

    public void setCidade(Cidade cidade) {
        this.estado = estado;
    }
    
    
    
}
 
    
    

