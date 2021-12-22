package br.com.zup.Compras.controllers;

import br.com.zup.Compras.dtos.CategoriaDto;
import br.com.zup.Compras.entitys.Categoria;
import br.com.zup.Compras.services.CategoriaService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/categorias")

public class CategoriaController {
    @Autowired
    private CategoriaService categoriaService;

    @Autowired
    private ModelMapper modelMapper;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public CategoriaDto cadastrarCategoria(@RequestBody @Valid CategoriaDto categoria) {
        Categoria novaCategoria = modelMapper.map(categoria, Categoria.class);
        return modelMapper.map(categoriaService.salvarCategoria(novaCategoria), CategoriaDto.class);
    }

    @GetMapping("/{id}")
    public Categoria buscarCategoriaPorId(@PathVariable Integer id) {
        Categoria categoria = categoriaService.buscarCategoriaPorId(id);
        return categoria;

    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deletarcategoriaPorId(@PathVariable Integer id) {
        categoriaService.deletarCategoria(id);
    }
}
