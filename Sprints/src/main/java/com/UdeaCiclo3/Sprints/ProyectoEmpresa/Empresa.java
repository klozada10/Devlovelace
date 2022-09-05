package com.UdeaCiclo3.Sprints.ProyectoEmpresa;

import com.UdeaCiclo3.Sprints.ProyectoEmpleado.Empleado;
import com.UdeaCiclo3.Sprints.ProyectoTransaccion.Transaccion;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Empresa")

public class Empresa {


    @Id
    private long id;
    @Column(nullable = false,length = 50)
    private String name;
    @Column(nullable = false,length = 50)
    private String document;
    private String phone;
    private String address;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private Empleado user;
    @ManyToOne
    @JoinColumn(name = "transactions_id")
    private Transaccion transactions;
    private Date createdAt;
    private Date updatedAt;

    public Empresa() {
    }

    public Empresa(long id, String name, String document, String phone, String address, Empleado user, Transaccion transactions, Date createdAt, Date updatedAt) {
        this.id = id;
        this.name = name;
        this.document = document;
        this.phone = phone;
        this.address = address;
        this.user = user;
        this.transactions = transactions;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Empleado getUser() {
        return user;
    }

    public void setUser(Empleado user) {
        this.user = user;
    }

    public Transaccion getTransactions() {
        return transactions;
    }

    public void setTransactions(Transaccion transactions) {
        this.transactions = transactions;
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
