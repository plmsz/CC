package exemplo_leitura_banco;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Principal {

	public static void main(String[] args) {
		Connection conexao = null;
		final String select = "SELECT * FROM ALUNOS";
		
		try {
			conexao = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\paloma.souza\\Downloads\\db\\programacaoI.db");;
		
			PreparedStatement preparedStatement = conexao.prepareStatement(select);
		
			ResultSet rs = preparedStatement.executeQuery();
			
			while(rs.next()) {
				int id = rs.getInt("id");
				String nome = rs.getString("nome");
				System.out.println(id + " " + nome);
			}
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		catch(Exception e){
			e.printStackTrace();
		}finally {
			System.out.println("fim");
		}
	}

}
