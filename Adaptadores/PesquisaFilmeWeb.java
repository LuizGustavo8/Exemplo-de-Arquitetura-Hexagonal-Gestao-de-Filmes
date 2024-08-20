package Adaptadores;

import static spark.Spark.*;
import Dominio.PesquisaFilme;

// Oferece acesso ao sistema através de Web/REST endpoints,
// implementados usando SparkJava.
// Na Arquitetura Hexagonal, esta classe funciona como um adaptador,
// conectando a interface web à lógica de negócios.


public class PesquisaFilmeWeb {
   PesquisaFilme pesq;

   public PesquisaFilmeWeb(PesquisaFilme pesq) {
      this.pesq = pesq;
   }
   
   public void start() {
     staticFiles.location("/templates");
        
     get("/", (req, res) -> { 
        res.redirect("index.html");
        return null;
     });

     get("/pesquisa", (req, res) -> { 
        String diretor = req.queryParams("diretor");
        return pesq.pesquisaPorDiretor(diretor);
     });
   }
}