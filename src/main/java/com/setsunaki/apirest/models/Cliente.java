package com.setsunaki.apirest.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "clientes")
public class Cliente implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty(message = "no puede estar vacio")
    @Size(min = 4, message = "debe tener 4 caracteres como minimo")
    @Column(nullable = false)
    private String nombre;

    @NotEmpty(message = "no puede estar vacio")
    private String apellido;

    @NotEmpty(message = "no puede estar vacio")
    @Email(message = "no es una direccion de correo bien formada")
    @Column(nullable = false, unique = true)
    private String email;

    @NotNull(message = "no puede estar vacio")
    @Column(name = "create_at")
    @Temporal(TemporalType.DATE)
    private Date createAt;


    //GETTER AND SETTER
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public Date getCreateAt() {
        return createAt;
    }
    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    private static final long serialVersionUID = 1L;

}
