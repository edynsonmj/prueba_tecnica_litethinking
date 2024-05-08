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
@Table(name="cliente")
@Setter @Getter @AllArgsConstructor @NoArgsConstructor
public class Cliente {
    @Id
    @Column(name="cli_id")
    private String id;
    
    @Column(name="cli_nombre")
    private String nombre;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, mappedBy = "objCliente")
    private List<Orden> ordenes;
}
