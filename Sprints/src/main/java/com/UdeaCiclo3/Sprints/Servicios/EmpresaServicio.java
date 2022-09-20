package com.UdeaCiclo3.Sprints.Servicios;


import com.UdeaCiclo3.Sprints.Entidades.Empresa;
import com.UdeaCiclo3.Sprints.Repositorio.EmpresaRepositorio;
import org.springframework.stereotype.Service;
import java.util.Optional;


@Service
public class EmpresaServicio {

    private EmpresaRepositorio repositorio;
    public EmpresaServicio(EmpresaRepositorio repositorio){

        this.repositorio=repositorio;
    }
    public  Optional<Empresa>buscarDocumentoNit(String document){
        return repositorio.findByDocument(document);
    }


}
