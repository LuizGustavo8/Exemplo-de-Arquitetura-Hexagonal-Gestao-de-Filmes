package Dominio;

// Interface para o serviço de busca de filmes
// Na Arquitetura Hexagonal, esta interface atua como uma porta de entrada,
// permitindo que as solicitações externas interajam com a lógica de negócios.


public interface PesquisaFilme {
  String pesquisaPorDiretor(String diretor);
}