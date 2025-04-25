package semana1;

import java.util.Scanner;
        
public class Medina_Stephanie_Cuotas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Cuotas mensuales
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese Monto a financiar: ");
        int montoFinanciar = scanner.nextInt();
        
        System.out.print("Ingrese el tiempo a financiar: ");
        int tiempoFinanciar = scanner.nextInt();
        
        System.out.print("Ingrese el interes mensual: ");
        double interesMensual = scanner.nextDouble();
        
        System.out.print("Ingrese el porcentaje del seguro: ");
        double porcentajeMensual = scanner.nextDouble();
        
        double cuotaAplicada = montoFinanciar * interesMensual;
        double mensual = (double) montoFinanciar / tiempoFinanciar;
        double SubtotalCuota = cuotaAplicada + mensual;
        double seguroMensual = SubtotalCuota * porcentajeMensual;
        double totalCuota = SubtotalCuota + seguroMensual;
        
        System.out.println("\n***Cuotas Mensuales***");
        System.out.println("\nCuota de Pago Mensual" + SubtotalCuota);
        System.out.println("Total a pagar" + totalCuota);
        
        
        scanner.close();
          
    
    }
    
}
