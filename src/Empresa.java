import java.util.ArrayList;

public class Empresa {

    private  long id;
    private String nombre;
    private String documento;
    private String telefono;
    private String direccion;
    private ArrayList usuario;
    private ArrayList Transaccion;
    private String nit;


    public Empresa(long id, String nombre, String documento, String telefono, String direccion, ArrayList usuario, ArrayList transaccion, String nit) {
        this.id = id;
        this.nombre = nombre;
        this.documento = documento;
        this.telefono = telefono;
        this.direccion = direccion;
        this.usuario = usuario;
        Transaccion = transaccion;
        this.nit = nit;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public ArrayList getUsuario() {
        return usuario;
    }

    public void setUsuario(ArrayList usuario) {
        this.usuario = usuario;
    }

    public ArrayList getTransaccion() {
        return Transaccion;
    }

    public void setTransaccion(ArrayList transaccion) {
        Transaccion = transaccion;
    }
    
    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }
}
