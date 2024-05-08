package co.litethinking.core.appbackend.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="clasificacion")
public class Clasificacion {
    @Id
    @ManyToOne
    @JoinColumn(name = "cla_categoria_nombre")
    private Categoria objCategoria;

    @Id
    @ManyToOne
    @JoinColumn(name = "cla_producto_codigo")
    private Producto objProducto;
}
