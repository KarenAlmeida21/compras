package br.com.zup.Compras.dtos;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.Size;

@Getter
@Setter
@NoArgsConstructor
public class CategoriaDto {
    @Size(min = 2, message = "Um nome deve ter ao menos 2 caracteres")
    private String nome;
}
