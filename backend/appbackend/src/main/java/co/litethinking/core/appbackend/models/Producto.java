package co.litethinking.core.appbackend.models;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @AllArgsConstructor @NoArgsConstructor
@Entity
@Table(name= "producto")
public class Producto {
    @Id
    @Column(name="pro_codigo", nullable = false)
    private String codigo;
    @Column(name="pro_nombre", nullable = false)
    private String nombre;
    @Column(name="pro_caracteristicas")
    private String caracteristicas;
    
    @ManyToOne
    @JoinColumn(name = "pro_empresa_nit")
    private Empresa objEmpresa;

    @ManyToOne()
    @JoinColumn(name = "pro_orden_codigo")
    private Orden objOrden;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, mappedBy = "objProduct")
    private List<Precio> precios;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, mappedBy = "objProducto")
    private List<Clasificacion> clasificaciones;
}
