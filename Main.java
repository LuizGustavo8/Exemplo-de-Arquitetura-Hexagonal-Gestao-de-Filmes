// Arquitetura Hexagonal - Exemplo Prático
//Este projeto é um exemplo prático de aplicação da Arquitetura Hexagonal para a gestão de //filmes. O objetivo principal é demonstrar como aplicar os conceitos de Arquitetura //Hexagonal, separando a lógica de negócio das interações externas.


import Adaptadores.PesquisaFilmeWeb;
import Adaptadores.RepositorioImpl;
import Dominio.PesquisaFilmeImpl;

public class Main {
  public static void main(String[] args) {
    RepositorioImpl repo = new RepositorioImpl();
    PesquisaFilmeImpl pesq = new PesquisaFilmeImpl(repo);
    new PesquisaFilmeWeb(pesq).start();
  }
}