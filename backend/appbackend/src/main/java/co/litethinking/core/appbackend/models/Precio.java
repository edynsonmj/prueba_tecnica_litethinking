package co.litethinking.core.appbackend.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter @Getter @AllArgsConstructor @NoArgsConstructor
@Entity
@Table(name="precio")
public class Precio {
    @Id
    @Column(name = "pre_moneda", nullable = false)
    private String moneda;
    @Column(name="pre_valor", nullable=false)
    private Double pre_valor;
    @Id
    @ManyToOne()
    @JoinColumn(name = "pre_producto_codigo")
    private Producto objProduct;
}
