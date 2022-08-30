

public class Empleado{

    private Long documentoIdentidad;
    private String nombreEmpleado;
    private String correo;
    private Empresa empresa;
    private rol rol;

    // Getters and Setters
    public Long getDocumentoIdentidad() {
        return documentoIdentidad;
    }

    public void setDocumentoIdentidad(Long documentoIdentidad) {
        this.documentoIdentidad = documentoIdentidad;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public rol getRol() {
        return rol;
    }

    public void setRol(rol rol) {
        this.rol = rol;
    }
    //ToString
    @Override
    public String toString() {
        return "Empleado [correo=" + correo + ", documentoIdentidad=" + documentoIdentidad + ", empresa=" + empresa
                + ", nombreEmpleado=" + nombreEmpleado + ", rol=" + rol + "]";
    }
    //Constructor
    public Empleado(Long documentoIdentidad, String nombreEmpleado, String correo, Empresa empresa, rol rol) {
        this.documentoIdentidad = documentoIdentidad;
        this.nombreEmpleado = nombreEmpleado;
        this.correo = correo;
        this.empresa = empresa;
        this.rol = rol;
    }
}