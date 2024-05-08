package co.litethinking.core.appbackend.models;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="categoria")
@Setter @Getter @AllArgsConstructor @NoArgsConstructor
public class Categoria {
    @Id
    @Column(name="cat_nombre")
    private String nombre;
    @Column(name="cat_descripcion")
    private String descripcion;
    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, mappedBy = "objCategoria")
    private List<Clasificacion> clasificaciones;
}
