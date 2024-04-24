package paquete1;
public class horas {
    //atributos
    private int horas;
    private int minutos;
    private int segundos;
    private double dias;
    //metodos
    public void sethoras(int horas){
        this.horas=horas;
    }
    public int gethoras(){
        return horas;
    }
    public void calcularsegundos(){
        segundos=horas*3600;
    }
    public int getsegundos(){
        return segundos;
    }
    
    public void calcularminutos(){
        minutos=horas*60;
    }
    public int getminutos(){
        return minutos;
    }
    
    public void calculardias(){
        dias=horas/24;
    }
    public double getdias(){
        return dias;
    }
    
}
