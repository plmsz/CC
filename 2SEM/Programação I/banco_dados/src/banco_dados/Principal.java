package banco_dados;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Principal {

	public static void main(String[] args) {
		Connection conn = null;
		final String instrucao_insert = "INSERT INTO ALUNOS(Id, Nome) VALUES(?,?)";
		final String instrucao_update = "UPDATE ALUNOS SET nome=? WHERE ID=?";
		final String instrucao_select = "SELECT * FROM ALUNOS";
		final String instrucao_delete = "DELETE FROM Alunos WHERE Id=?";

		try {
			conn = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\paloma.souza\\Downloads\\db\\programacaoI.db");

			/*
			 * PreparedStatement preparedStatement =
			 * conn.prepareStatement(instrucao_insert); preparedStatement.setInt(1,3); // na
			 * primeira interrogação insira o int 3 preparedStatement.setString(2, "Joana");
			 * //na segunda interrogação insere o string Ana
			 * preparedStatement.executeUpdate();
			 */

			/*
			 * PreparedStatement preparedStatement =
			 * conn.prepareStatement(instrucao_update); preparedStatement.setString(1,
			 * "Joana"); preparedStatement.setInt(2, 7); preparedStatement.executeUpdate();
			 */

			PreparedStatement preparedStatement = conn.prepareStatement(instrucao_delete);
			preparedStatement.setInt(1, 1);
			preparedStatement.executeUpdate();

			PreparedStatement preparedStatementSelect = conn.prepareStatement(instrucao_select);

			ResultSet rs = preparedStatementSelect.executeQuery();

			while (rs.next()) {
				int id = rs.getInt("id");
				String nome = rs.getString("nome");
				System.out.println("id: " + id + " Nome " + nome);
			}

			System.out.println("sucesso");

		} catch (SQLException ex) {
			// handle any errors
			System.out.println("SQLException: " + ex.getMessage());
			System.out.println("SQLState: " + ex.getSQLState());
			System.out.println("VendorError: " + ex.getErrorCode());
		}

	}

}
