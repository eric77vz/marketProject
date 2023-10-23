package com.platzimarket.persistence.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.context.annotation.EnableMBeanExport;

@Entity
@Setter @Getter
@Table(name = "compras_productos")
public class ComprasProducto {
    @EmbeddedId //Se agrega @EmbeddedId cuando la clave primaria es compuesta y esta dada por otra clase, de lo contrario solo se por @Id para indicar la PK
    private ComprasProductoPK id;

    private Integer cantidad;
    private Double total;
    private Boolean estado;
    @ManyToOne
    @JoinColumn(name = "id_compra", insertable = false,updatable = false)
    private Compra compra;

}
