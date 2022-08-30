public class Empresa {

    private String nombreEmpresa;
    private String direccion;
    private String telefono;
    private long nit;

    public Empresa() {
    }

    // Getters and Setters
    public String getNombreEmpresa() {
        return nombreEmpresa;
    }
    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public long getNit() {
        return nit;
    }
    public void setNit(long nit) {
        this.nit = nit;
    }
    //ToString
    @Override
    public String toString() {
        return "Empresa [direccion=" + direccion + ", nit=" + nit + ", nombreEmpresa=" + nombreEmpresa + ", telefono="
                + telefono + "]";
    }
    //Constructor
    public Empresa(String nombreEmpresa, String direccion, String telefono, long nit) {
        this.nombreEmpresa = nombreEmpresa;
        this.direccion = direccion;
        this.telefono = telefono;
        this.nit = nit;
    }
}