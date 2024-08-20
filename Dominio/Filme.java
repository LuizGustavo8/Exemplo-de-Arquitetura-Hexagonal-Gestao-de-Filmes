package Dominio;

// Na terminologia de Domain-Driven Design (DDD), a classe Filme é considerada uma Entidade.
// O mesmo conceito se aplica na Arquitetura Limpa.


public class Filme {
  private String isbn;
  private String diretor;
  private String titulo;

  public Filme(String isbn, String diretor, String titulo) {
    this.isbn = isbn;
    this.diretor = diretor;
    this.titulo = titulo;
  }

  public String getISBN() {
    return this.isbn;
  }

  public String getdiretor() {
    return this.diretor;
  }

  public String getTitulo() {
    return this.titulo;
  }
}