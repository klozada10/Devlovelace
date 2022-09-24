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
    public boolean agregarPorEmpleado(String id){
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

    public boolean guardarTransaccion(Transaccion transaccion){
        Transaccion mov=repositorio.save(transaccion);
        if (repositorio.findByUserId(mov.getId()) == Boolean.parseBoolean(null)){
            return true;
        }else {
            return false;
        }
    }
    public ArrayList<Transaccion> idEmpresa(Long id){
        return repositorio.findByEnterpriseId(id);
    }
}
