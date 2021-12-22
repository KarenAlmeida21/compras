package br.com.zup.Compras.repositories;

import br.com.zup.Compras.entitys.Produto;
import org.springframework.data.repository.CrudRepository;

public interface ProdutoRepository extends CrudRepository<Produto, Integer> {
}
