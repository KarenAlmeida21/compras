package br.com.zup.Compras.services;

import br.com.zup.Compras.entitys.Categoria;
import br.com.zup.Compras.exceptions.CategoriaNaoLocalizadaException;
import br.com.zup.Compras.repositories.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class CategoriaService {
    @Autowired
    private CategoriaRepository categoriaRepository;

    public Categoria salvarCategoria(Categoria categoria) {
        return categoriaRepository.save(categoria);
    }
    public Categoria buscarCategoriaPorId(Integer id){
        Optional<Categoria>categoriaId = categoriaRepository.findById(id);
        if(categoriaId.isEmpty()){
            throw new CategoriaNaoLocalizadaException("Categoria não localizada");
        }
        return categoriaId.get();
    }
}
