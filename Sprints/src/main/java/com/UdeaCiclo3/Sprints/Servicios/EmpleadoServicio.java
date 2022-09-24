package com.UdeaCiclo3.Sprints.Servicios;

import com.UdeaCiclo3.Sprints.Entidades.Empleado;
import com.UdeaCiclo3.Sprints.Entidades.Roles;
import com.UdeaCiclo3.Sprints.Repositorio.EmpleadoRepositorio;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class EmpleadoServicio {

    private EmpleadoRepositorio repositorio;

    public EmpleadoServicio(EmpleadoRepositorio repositorio) {
        this.repositorio = repositorio;
    }

    public ArrayList<Empleado>enlistarEmpleados(){
        return (ArrayList<Empleado>) repositorio.findAll();
    }
    private Optional<Empleado> buscarEmpleado(Long id) {
        return repositorio.findById(id);
    }

    public Empleado buscarEmpleado(String id){
        return repositorio.findById(id);
    }

    public boolean agregarEmpleado(Empleado empleado){
        if (!buscarEmpleado(empleado.getId()).isPresent()){
            repositorio.save(empleado);
            return Boolean.parseBoolean("Se agergo exitosamente el empleado");
        }else {
            return Boolean.parseBoolean("No se registro el empleado");
        }
    }




    public String actualizarRol(String id,String role){
        if (buscarEmpleado(id).isPresent()){
            Empleado empleado=repositorio.findById(id).get();
            empleado.setRole(Roles.valueOf(role));
            repositorio.save(empleado);
            return "Rol actualizado";
        }else {
            return "Rol no actulizado";
        }
    }

    public String eliminarEmpleado(String id){
        if (buscarEmpleado(id).isPresent()){
            repositorio.deleteById(id);
            return "Empleado eliminado";
        }else {
            return "Empleado ya sea eliminado con anterioridad";
        }
    }


}
