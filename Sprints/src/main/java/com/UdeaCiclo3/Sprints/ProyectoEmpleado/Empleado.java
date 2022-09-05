package com.UdeaCiclo3.Sprints.ProyectoEmpleado;

import com.UdeaCiclo3.Sprints.ProyectoEmpresa.Empresa;
import com.UdeaCiclo3.Sprints.ProyectoPerfil.Perfil;
import com.UdeaCiclo3.Sprints.ProyectoRol.Roles;
import com.UdeaCiclo3.Sprints.ProyectoTransaccion.Transaccion;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Empleado")
public class Empleado {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String email;
    @ManyToOne
    @JoinColumn(name = "profile_id")
    private Perfil profile;
    private Roles role;
    @ManyToOne
    @JoinColumn(name = "enterprise_id")
    private Empresa enterprise;
    @ManyToOne
    @JoinColumn(name = "transacctions_id")
    private Transaccion transacctions;
    private Date updatedAt;
    private Date createdAt;


    public Empleado() {
    }

    public Empleado(Long id, String email, Perfil profile, Roles role, Empresa enterprise, Transaccion transacctions, Date updatedAt, Date createdAt) {
        this.id = id;
        this.email = email;
        this.profile = profile;
        this.role = role;
        this.enterprise = enterprise;
        this.transacctions = transacctions;
        this.updatedAt = updatedAt;
        this.createdAt = createdAt;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Perfil getProfile() {
        return profile;
    }

    public void setProfile(Perfil profile) {
        this.profile = profile;
    }

    public Roles getRole() {
        return role;
    }

    public void setRole(Roles role) {
        this.role = role;
    }

    public Empresa getEnterprise() {
        return enterprise;
    }

    public void setEnterprise(Empresa enterprise) {
        this.enterprise = enterprise;
    }

    public Transaccion getTransacctions() {
        return transacctions;
    }

    public void setTransacctions(Transaccion transacctions) {
        this.transacctions = transacctions;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", profile=" + profile +
                ", role=" + role +
                ", enterprise=" + enterprise +
                ", transacctions=" + transacctions +
                ", updatedAt=" + updatedAt +
                ", createdAt=" + createdAt +
                '}';
    }
}
