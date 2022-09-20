package com.UdeaCiclo3.Sprints.Repositorio;

import com.UdeaCiclo3.Sprints.Entidades.Transaccion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface TransaccionRepositorio extends JpaRepository<Transaccion,Long> {
    public abstract ArrayList<Transaccion>findByEnterpriseId(Long empresaId);
    public abstract ArrayList<Transaccion>findByUserId(Long userId);
}
