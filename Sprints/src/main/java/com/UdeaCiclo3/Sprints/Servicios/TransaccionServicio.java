package com.UdeaCiclo3.Sprints.Servicios;

import com.UdeaCiclo3.Sprints.Entidades.Transaccion;
import com.UdeaCiclo3.Sprints.Repositorio.TransaccionRepositorio;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class TransaccionServicio {

    private TransaccionRepositorio repositorio;

    public TransaccionServicio(TransaccionRepositorio repositorio) {
        this.repositorio = repositorio;
    }

    public ArrayList<Transaccion>agregarPorEmpresa(Long id){
        return repositorio.findByEnterpriseId(id);
    }
    public ArrayList<Transaccion>agregarPorEmpleado(Long id){
        return repositorio.findByUserId(id);
    }

    public boolean eliminarTransaccion(Long id){
        repositorio.deleteById(id);
        if (this.repositorio.findByUserId(id).isEmpty()){
            return false;
        }else {
            return true;
        }
    }

    public Transaccion guardarTransaccion(Transaccion transaccion){
        return repositorio.save(transaccion);
    }
}
