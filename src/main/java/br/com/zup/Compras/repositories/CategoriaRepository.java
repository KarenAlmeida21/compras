package br.com.zup.Compras.repositories;

import br.com.zup.Compras.entitys.Categoria;
import org.springframework.data.repository.CrudRepository;

public interface CategoriaRepository extends CrudRepository<Categoria, Integer> {
}
