package Dominio;

// Interface que o domínio utiliza para acessar o banco de dados.
// Conceitualmente, na Arquitetura Hexagonal, esta interface atua como uma porta de saída, 
// permitindo que a lógica de negócios se comunique com componentes externos, como o banco de dados.


public interface Repositorio {
  public Filme getFilme(String diretor);
}