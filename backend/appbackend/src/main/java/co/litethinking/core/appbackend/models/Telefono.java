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
@Table(name="telefono")
public class Telefono {
    @Id
    @Column(name="tel_numero")
    private String numero;
    @Id
    @ManyToOne
    @JoinColumn(name = "tel_empresa_nit")
    private Empresa objEmpresa;
}