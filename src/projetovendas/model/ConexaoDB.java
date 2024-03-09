package projetovendas.model;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;



/**
 *
 * @author aluno
 */
public abstract class ConexaoDB {
    
    private static final String mysqlSenha = "";
    private static String mysqlUsuario = "root";
    private static String mysqlDatabase = "vendas";
    
    private static Connection mysqlConnection = null;
    
    private static Statement mysqlStatement = null;
    
    private static final String caminhoDoBanco = "jdbc:mysql://localhost:3306/"
            + ""+mysqlDatabase;
    
    public static Statement getStatement(){
        try {
            //cria a conexao
            mysqlConnection = DriverManager.getConnection(
                    caminhoDoBanco,mysqlUsuario,mysqlSenha);
            //cria o statement(ponte) para o banco
            mysqlStatement = mysqlConnection.createStatement();
        } catch (SQLException e) {
        }
        return mysqlStatement;
    }
    
}
