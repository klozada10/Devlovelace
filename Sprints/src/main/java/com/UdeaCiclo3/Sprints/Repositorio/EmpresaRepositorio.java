package com.UdeaCiclo3.Sprints.Repositorio;


import com.UdeaCiclo3.Sprints.Entidades.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EmpresaRepositorio extends JpaRepository <Empresa,String> {

    public Optional <Empresa>findByDocument(String document);


}
