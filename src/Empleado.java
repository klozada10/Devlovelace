public class Empleado {

    private String nombre;
    private String apellido;
    private String DocumentoIdentidad;
    private int edad;
    private int HorasTrabajadas;
    private int pagoPorHora;

    public Empleado(String nombre, String apellido, String documentoIdentidad, int edad, int horasTrabajadas, int pagoPorHora) {
        this.nombre = nombre;
        this.apellido = apellido;
        DocumentoIdentidad = documentoIdentidad;
        this.edad = edad;
        HorasTrabajadas = horasTrabajadas;
        this.pagoPorHora = pagoPorHora;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDocumentoIdentidad() {
        return DocumentoIdentidad;
    }

    public void setDocumentoIdentidad(String documentoIdentidad) {
        DocumentoIdentidad = documentoIdentidad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getHorasTrabajadas() {
        return HorasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        HorasTrabajadas = horasTrabajadas;
    }

    public int getPagoPorHora() {
        return pagoPorHora;
    }

    public void setPagoPorHora(int pagoPorHora) {
        this.pagoPorHora = pagoPorHora;
    }
}
