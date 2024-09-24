package usa.com.nba.atletas;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javafx.event.ActionEvent;

public class OperacoesBanco {
	public static void inserirAluno(ActionEvent event) {
	     String sql = "INSERT INTO atletas_tb (id_atletas, nome, sobrenome, idade, posicao, equipe) VALUES (?, ?, ?, ?, ?, ?)";
	     try (Connection conexao = Conexao.conectar();
	          PreparedStatement pstmt = conexao.prepareStatement(sql)) {
	         pstmt.setInt(1, 1);
	         pstmt.setString(2, txt_nome.getText());
	         pstmt.setString(3, txt_sobrenome.getText());
	         pstmt.setInt(4, txt_idade.getText());
		 	 pstmt.setString(5, txt_posicao.getText());
		 	pstmt.setString(5, txt_equipe.getText());
	         pstmt.executeUpdate();
	     }catch (SQLException e) {
	         e.printStackTrace();
	     }
}
