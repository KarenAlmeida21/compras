package br.com.zup.Compras.repositories;

import br.com.zup.Compras.entitys.Categoria;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaRepository extends CrudRepository<Categoria, Integer> {
}
