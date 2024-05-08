package co.litethinking.core.appbackend.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="usuario")
public class Usuario {
    @Id
    @Column(name="usu_email")
    private String email;
    @Column(name="usu_password")
    private String password;
    @Column(name="usu_role")
    private String role;
}
