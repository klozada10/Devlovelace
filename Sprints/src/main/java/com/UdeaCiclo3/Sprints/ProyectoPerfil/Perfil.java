package com.UdeaCiclo3.Sprints.ProyectoPerfil;

import com.UdeaCiclo3.Sprints.ProyectoEmpleado.Empleado;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table (name="Perfil")
public class Perfil {

    @Id
    private Long id;
    private String image;
    private String phone;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private Empleado user;
    private Date creatAt;
    private Date updateAt;

    public Perfil() {
    }

    public Perfil(Long id, String image, String phone, Empleado user, Date creatAt, Date updateAt) {
        this.id = id;
        this.image = image;
        this.phone = phone;
        this.user = user;
        this.creatAt = creatAt;
        this.updateAt = updateAt;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Empleado getUser() {
        return user;
    }

    public void setUser(Empleado user) {
        this.user = user;
    }

    public Date getCreatAt() {
        return creatAt;
    }

    public void setCreatAt(Date creatAt) {
        this.creatAt = creatAt;
    }

    public Date getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }

    @Override
    public String toString() {
        return "Perfil{" +
                "id=" + id +
                ", image='" + image + '\'' +
                ", phone='" + phone + '\'' +
                ", user=" + user +
                ", creatAt=" + creatAt +
                ", updateAt=" + updateAt +
                '}';
    }
}
