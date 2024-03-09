
package projetovendas.model;

import java.sql.SQLException;
import java.sql.Statement;
import projetovendas.interfaces.IOperacao;

/**
 *
 * @author surfa
 */
public class Estado implements IOperacao{
    
    
    @Override
    public void cadastrar() {
         String insert  = "INSERT INTO estado (sigla_estado, nome_estado) ";
        Statement mysqStatement = ConexaoDB.getStatement();
         
        try {
            mysqStatement.executeUpdate(insert);
        } catch (SQLException ex) {
        }
         
       
    }
  
    @Override
    public boolean alterar() {
        return false;
    }

    @Override
    public boolean excluir() {
        return false;
    }

    @Override
    public void cancelar() {

    }

}
