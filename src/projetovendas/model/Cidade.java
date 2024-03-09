
package projetovendas.model;


import java.sql.SQLException;
import projetovendas.interfaces.IOperacao;
import java.sql.Statement;

/**
 *
 * @author aluno
 */
public class Cidade implements IOperacao {

    private String nome;
    private int codibge;
    
    private Statement mysqStatement = null;

   
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodibge() {
        return codibge;
    }

    public void setCodibge(int codibge) {
        this.codibge = codibge;
    }

    @Override
    public void cadastrar() {
         String insert  = "insert into cidade(nome_cidade, codigo_ibge) "
                + "values('"+getNome()+"',"+getCodibge()+")";
         mysqStatement = ConexaoDB.getStatement();
         
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

    @Override
    public String toString() {
        return "Cidade{" + "nome=" + nome + ", codibge=" + codibge + '}';
    }
    
    

}
