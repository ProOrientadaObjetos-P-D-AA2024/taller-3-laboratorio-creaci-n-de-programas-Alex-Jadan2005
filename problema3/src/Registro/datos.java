package Registro;

public class datos {

    private String nombre;
    private String tipo;
    private int numalumnos;
    private int numdocentes;
    private int sedes;
    private double gastos;
    private double presupuestos;
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getNumalumnos() {
        return numalumnos;
    }

    public void setNumalumnos(int numalumnos) {
        this.numalumnos = numalumnos;
    }

    public int getNumdocentes() {
        return numdocentes;
    }

    public void setNumdocentes(int numdocentes) {
        this.numdocentes = numdocentes;
    }

    public int getSedes() {
        return sedes;
    }

    public void setSedes(int sedes) {
        this.sedes = sedes;
    }

    public double getGastos() {
        return gastos;
    }

    public void setGastos(int gastos) {
        this.gastos = gastos;
    }

    public void pres(){
        presupuestos=gastos*numalumnos;
    }
    
    public double getPresupuestos() {
        return presupuestos;
    }
    
    
    
    
}
