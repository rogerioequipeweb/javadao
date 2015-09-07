import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import dao.produtosDAO;
import modelo.Produto;

public class TestaDao {
	
	public static void main(String[] args) throws SQLException {
		 Produto mesa = new Produto("Mesa Azul", "Mesa com 4 pés");
		 try (Connection connection = new ConnectionPool().getConnection()) {
			 
			 produtosDAO dao = new produtosDAO(connection);
			 dao.salva(mesa);
			 
			 List<Produto> produtos = dao.lista();
	            for (Produto produto : produtos) {
	                System.out.println("Existe o produto: " + produto);
	            }
	      }
		 System.out.println(mesa);
	}
}
