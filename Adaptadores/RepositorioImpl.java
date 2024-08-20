package Adaptadores;

import java.sql.*;
import Dominio.Repositorio;
import Dominio.Filme;


// Implementa o acesso ao sistema de banco de dados.
// Na Arquitetura Hexagonal, essa classe atua como um adaptador,
// conectando a lógica de negócios ao banco de dados.


public class RepositorioImpl implements Repositorio {
  
  public Filme getFilme(String diretor) {
    try(Connection con = DriverManager.getConnection("jdbc:sqlite:BD/bib.db")) {
       String query = "select * from filmes where diretor = ?"; 
       PreparedStatement stmt = con.prepareStatement(query);
       stmt.setString(1, diretor);
       ResultSet rs = stmt.executeQuery();
       String isbn = rs.getString("isbn");
       String titulo = rs.getString("titulo");
       return new Filme(isbn, diretor, titulo);
    } catch (SQLException e) {
      System.out.println(e.getMessage());
      return null;
    } 
  }       

}