package br.com.zup.Compras.repositories;

import br.com.zup.Compras.entitys.Produto;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends CrudRepository<Produto, Integer> {
}
