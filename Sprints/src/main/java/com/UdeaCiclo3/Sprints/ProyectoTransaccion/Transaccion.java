package com.UdeaCiclo3.Sprints.ProyectoTransaccion;

import com.UdeaCiclo3.Sprints.ProyectoEmpleado.Empleado;
import com.UdeaCiclo3.Sprints.ProyectoEmpresa.Empresa;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Transaccion")

public class Transaccion {

    @Id
    private String id;
    private String concept;
    private Float amount;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private Empleado user;
    @ManyToOne
    @JoinColumn(name = "enterprise_id")
    private Empresa enterprise;
    private Date createdAt;
    private Date updatedAt;

    public Transaccion() {
    }

    public Transaccion(String id, String concept, Float amount, Empleado user, Empresa enterprise, Date createdAt, Date updatedAt) {
        this.id = id;
        this.concept = concept;
        this.amount = amount;
        this.user = user;
        this.enterprise = enterprise;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getConcept() {
        return concept;
    }

    public void setConcept(String concept) {
        this.concept = concept;
    }

    public Float getAmount() {
        return amount;
    }

    public void setAmount(Float amount) {
        this.amount = amount;
    }

    public Empleado getUser() {
        return user;
    }

    public void setUser(Empleado user) {
        this.user = user;
    }

    public Empresa getEnterprise() {
        return enterprise;
    }

    public void setEnterprise(Empresa enterprise) {
        this.enterprise = enterprise;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
}
