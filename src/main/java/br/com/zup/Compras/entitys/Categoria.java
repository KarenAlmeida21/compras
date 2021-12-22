package br.com.zup.Compras.entitys;

import com.fasterxml.jackson.annotation.JsonTypeId;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Getter
@Setter
@NoArgsConstructor

@Entity
@Table(name = "compras")
public class Categoria {
    @Id
    private Integer id;
    private String nome;
}
