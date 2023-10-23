package com.platzimarket.persistence.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;


@Entity @Getter @Setter
@Table(name = "categorias")

public class Categoria {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_categoria")
    private Integer idCategoria;

    private String descripcion;

    private Boolean estado;

    //Mapeo de relacion
    @OneToMany(mappedBy = "categoria")
    private List<Producto> productos;

}
