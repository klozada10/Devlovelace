package com.UdeaCiclo3.Sprints.Controlador;

import com.UdeaCiclo3.Sprints.Entidades.Empleado;
import com.UdeaCiclo3.Sprints.Servicios.EmpleadoServicio;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
public class vistaEmpresaControlador {

    EmpleadoServicio servicio;

    public vistaEmpresaControlador(EmpleadoServicio servicio) {
        this.servicio = servicio;
    }

    @GetMapping("/Prueba/{nombre}")
    public String prueba(@PathVariable("nombre")String nombre, Model model) {
        model.addAttribute("nombre", nombre);
        return "Empleado";
    }

    @GetMapping("/Libro")
    public String prueba(Model model) {
        List<Empleado> lista = this.servicio.enlistarEmpleados();
        model.addAttribute("lista", lista);
        return "Empleado";
    }

    @GetMapping("/formEmpleado")
    public  String mostrarFormulario(Model model){
        model.addAttribute("empleado",new Empleado());
        return "registrarEmpleado";
    }
    @PostMapping("/RegistrarEmpleado")
    public String agregarLibro(@ModelAttribute("empleado")Empleado empleado, Model model, RedirectAttributes attributes){
        if(servicio.agregarEmpleado(empleado)){
            attributes.addFlashAttribute("mensajeOk","Empleado resgitrado exitosamente.");
        }else {
            attributes.addFlashAttribute("error","Error,el Empleado no se registro");
        }
        return "redirect:/Empleado";

    }

    @GetMapping("/editarEmpleado/{id}")
    public String editEmpleado(@PathVariable("id")String id,Model model){
        model.addAttribute("libro",servicio.buscarEmpleado(id));
        return "editarEmpleado";
    }

    @GetMapping("/eliminarEmpleado/{id}")
    public String eliminarEmpleado(@PathVariable("id") String id,Model model){
        servicio.eliminarEmpleado(id);
        return "redirect:/Empleados";
    }
    @PostMapping("/guardarEmpleado/{id}")
    public String actualizarLibro(@PathVariable("id")String id,@ModelAttribute("empleado")Empleado empleado,Model model){
        Empleado emp=servicio.buscarEmpleado(id);
        emp.setId(empleado.getId());
        emp.setEmail(empleado.getEmail());
        emp.setRole(empleado.getRole());
        emp.setEnterprise(empleado.getEnterprise());
        servicio.buscarEmpleado(id);
        return "redirect:/Libros";
    }


}
