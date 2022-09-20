package com.UdeaCiclo3.Sprints.Controlador;

import com.UdeaCiclo3.Sprints.Entidades.Empleado;
import com.UdeaCiclo3.Sprints.Servicios.EmpleadoServicio;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
public class EmpleadoControlador {
    private EmpleadoServicio servicio;

    public EmpleadoControlador(EmpleadoServicio servicio) {
        this.servicio = servicio;
    }
    @GetMapping("/EnlistarEmpleados")
    public ArrayList<Empleado>listar(){
        return servicio.enlistarEmpleados();
    }

    @GetMapping("/BuscarEmpleados/{id}")
    public Optional<Empleado>buscarEmpleado(@PathVariable("id") String id){
        return servicio.buscarEmpleado(id);
    }

    @PutMapping("/ActualizarRol/{id}/{role}")
    public String actualizarRol(@PathVariable("id")String id,@PathVariable("role")String role){
        return servicio.actualizarRol(id, role);
    }

    @DeleteMapping("/EliminarEmpleado")
    public String eliminarEmpleado(@PathVariable("id")String id){
        return servicio.eliminarEmpleado(id);
    }
}
