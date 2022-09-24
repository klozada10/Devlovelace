package com.UdeaCiclo3.Sprints.Repositorio;

import com.UdeaCiclo3.Sprints.Entidades.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpleadoRepositorio extends JpaRepository  <Empleado, Long>{
    Empleado findById(String id);

    void deleteById(String id);


    //ArrayList<Transaccion> findAllByEmpleadoId(Empleado id);
}
