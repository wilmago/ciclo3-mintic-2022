public class MovimientoDinero {

    private double montoMovimiento;
    private String concepto;
    private Empleado usuario;
    private Empresa empresa;

    // Getters and Setters
    public double getMontoMovimiento() {
        return montoMovimiento;
    }
    public void setMontoMovimiento(double montoMovimiento) {
        this.montoMovimiento = montoMovimiento;
    }
    public String getConcepto() {
        return concepto;
    }
    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }
    public Empleado getUsuario() {
        return usuario;
    }
    public void setUsuario(Empleado usuario) {
        this.usuario = usuario;
    }
    public Empresa getEmpresa() {
        return empresa;
    }
    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }
    //ToString
    @Override
    public String toString() {
        return "MovimientoDinero [concepto=" + concepto + ", empresa=" + empresa + ", montoMovimiento="
                + montoMovimiento + ", usuario=" + usuario + "]";
    }
    //Constructor
    public MovimientoDinero(double montoMovimiento, String concepto, Empleado usuario, Empresa empresa) {
        this.montoMovimiento = montoMovimiento;
        this.concepto = concepto;
        this.usuario = usuario;
        this.empresa = empresa;
    }
}
