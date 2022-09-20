package com.UdeaCiclo3.Sprints.Controlador;


import com.UdeaCiclo3.Sprints.Servicios.EmpresaServicio;
import com.UdeaCiclo3.Sprints.Entidades.Empresa;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class EmpresaControlador {
    private EmpresaServicio servicio;
    public EmpresaControlador(EmpresaServicio servicio){
        this.servicio=servicio;
    }

    @GetMapping("/BuscarEmpresaDoc/{document}")
    public Optional<Empresa>buscarDocumento(@PathVariable("document")String document){
        return servicio.buscarDocumentoNit(document);
    }
}
