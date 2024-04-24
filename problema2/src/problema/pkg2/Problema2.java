package problema.pkg2;

import java.util.Scanner;
import paquete1.horas;

public class Problema2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        horas uno=new horas();
        
        System.out.println("CALCULAR DIAS, HORAS, MINUTOS, SEGUNDOS");
        System.out.print("Ingrese las horas a calcular: ");
        int horas;
        horas=sc.nextInt();
        //setear
        uno.sethoras(horas);
        uno.calculardias();
        
        uno.calcularminutos();
        uno.calcularsegundos();
        //resultados
        System.out.println("RESULTADOS\nDias: "+uno.getdias()+"\nHoras: "+uno.gethoras()
        +"\nMinutos: "+uno.getminutos()+"\nSegundos: "+uno.getsegundos());
        
    }
    
}
