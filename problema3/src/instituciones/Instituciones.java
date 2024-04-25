package instituciones;

import java.util.Scanner;
import Registro.datos;

public class Instituciones {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //datos
        String nombre, tipo;
        int numal,  numdoc, sedes;
        double gastos, pres;
        System.out.println("INSTITUCIONES EDUCATIVAS");
        System.out.print("Nombre de la institucion: ");
        nombre=sc.nextLine();
        System.out.print("Tipo de institucion: ");
        tipo=sc.nextLine();
        System.out.print("Numero de alumnos: ");
        numal=sc.nextInt();
        System.out.print("Numero de docentes: ");
        numdoc=sc.nextInt();
        System.out.print("Numero de sedes: ");
        sedes=sc.nextInt();
        System.out.print("Gastos por estudiante: ");
        gastos=sc.nextDouble();
        //crear objeto
        datos uno=new datos();

        //setear
        uno.setNombre(nombre);
        uno.setTipo(tipo);
        uno.setNumalumnos(numal);
        uno.setNumdocentes(numdoc);
        uno.setSedes(sedes);
        uno.setGastos(sedes);
        uno.pres();
        //resultados
        System.out.println("----------------------------------------\n"
                + "Institucion: "+uno.getNombre()+ "\nTipo de Institucion: "
        +uno.getTipo()+"\nNumero de alumnos: "+uno.getNumalumnos()+"\nNumero de"
                + "docentes: "+uno.getNumdocentes()+"\nNumero de sedes: "+uno.getSedes()+
                "\nGastos por estudiantes: "+uno.getSedes()+"\nPresupuesto: $"+uno.getPresupuestos());
        
    }
    
}
