package com.UdeaCiclo3.Sprints.Controlador;

import com.UdeaCiclo3.Sprints.Entidades.Transaccion;
import com.UdeaCiclo3.Sprints.Servicios.TransaccionServicio;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class TransaccionControlador {

    TransaccionServicio servicio;

    public TransaccionControlador(TransaccionServicio servicio) {
        this.servicio = servicio;
    }

    @PostMapping("/AgregarTransaccion/{id}")
    public boolean agregarTransaccion(@PathVariable("id") String id) {
        return servicio.agregarPorEmpleado(id);
    }

    @PostMapping("/AgregarTransaccionEmpresa/{id}")
    public ArrayList<Transaccion> agregarTransaccionEmpresa(@PathVariable("id") String id) {
        return servicio.agregarPorEmpresa(Long.valueOf(id));
    }
}
