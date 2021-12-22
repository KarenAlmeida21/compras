package br.com.zup.Compras.entitys;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "produto")

public class Produto {
    @Id
    private Integer id;
    private String nome;
    private Double preco;
}
