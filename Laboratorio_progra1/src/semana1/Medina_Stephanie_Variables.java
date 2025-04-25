package semana1;

import java.util.Scanner;
 
public class Medina_Stephanie_Variables {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
       // Boleta de Entrada
       Scanner scanner = new Scanner(System.in).useDelimiter("\n");     
       System.out.print("Ingrese el nombre completo del empleado: ");
       String nombreEmpleado = scanner.next();
        
       System.out.print("Ingrese Horas de Trabajo Mensual: ");
       int horasTrabajadas = scanner.nextInt();
           
       System.out.print("Ingrese Tarifa por Hora: ");
       double tarifaHora = scanner.nextDouble();
       
       System.out.print("Ingrese Salario del Empleado Semanal: ");
       double salarioEmpleado = scanner.nextDouble();
       
       System.out.println("\n***Boleta de entrada***");
       System.out.println("nombreEmpleado: " + nombreEmpleado);
       System.out.println("horasTrabajadas: " + horasTrabajadas);
       System.out.println("tarifaHora: " + tarifaHora);
       System.out.println("salarioEmpleado: " + salarioEmpleado);
       
       
       scanner.close();
    }
    
}
