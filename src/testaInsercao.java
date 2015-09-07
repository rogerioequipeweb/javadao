import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class testaInsercao {
   public static void main(String[] args) throws SQLException {
	   
	   ConnectionPool connectionPool = new ConnectionPool();
   
	   Connection connection = connectionPool.getConnection();
	   Statement statement = connection.createStatement();
	   statement.execute("insert into Produto (nome, descricao) values ('Notebook', 'Notebook i5')",Statement.RETURN_GENERATED_KEYS);
	   //System.out.println("O resultado foi: " + resultado);
	   
	   ResultSet resultSet = statement.getGeneratedKeys();
	   while (resultSet.next())
	   {
		   String id = resultSet.getString("id");
           System.out.println(id + " gerado");
	   }
	   statement.close();
	   connection.close();
   }
}
