package Dominio;

// Classe do Domínio
// Responsável pela implementação do serviço de busca de filmes


public class PesquisaFilmeImpl implements PesquisaFilme {
  
  Repositorio repo;

  public PesquisaFilmeImpl(Repositorio repo) {
    this.repo = repo;
  }

  public String pesquisaPorDiretor(String diretor) {
    return repo.getFilme(diretor).getTitulo();
  }
}
