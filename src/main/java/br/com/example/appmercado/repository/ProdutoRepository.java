package br.com.example.appmercado.repository;

import br.com.example.appmercado.model.Produto;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface ProdutoRepository extends CrudRepository<Produto, Integer> {
    public List<Produto> findAllByNomeContaining(String palavraChave);
}
