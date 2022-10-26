import java.io.Console;
import java.util.ArrayList;


public class BucleWhile {
    public static void main(String[] args) {
        Console console = System.console();
        
        

            System.out.println("-----------------");
            int repeticiones = Integer.parseInt(console.readLine("Ingrese en n° de notas a calcular: "));
            int contador = 0;
            System.out.println("-----------------");
            
            double sumacalif = 0;
            

        while (repeticiones!=contador) {
            Double calif = Double.parseDouble(console.readLine("Ingrese su calificación: "));            
            if(calif>=0 && calif<=3){
                System.out.println("-----------------");
                System.out.println("No logrado");
                System.out.println("-----------------");
    
            }else if(calif>3 && calif<=5){
                System.out.println("-----------------");
                System.out.println("Insuficiente");
                System.out.println("-----------------");
    
            }else if(calif>5 && calif<=8){
                System.out.println("-----------------");
                System.out.println("Bueno");
                System.out.println("-----------------");
    
            }else if(calif>8 && calif<=10){
                System.out.println("-----------------");
                System.out.println("Excelente");
                System.out.println("-----------------");
    
            }else{
                System.out.println("-----------------");
                System.out.println("Calificación fuera de rango");
                System.out.println("-----------------");
            }
            sumacalif = (sumacalif + calif);
            contador++;
            
            System.out.println("-----------------");
            System.out.println("Su acumulado es: " + sumacalif);
            System.out.println("-----------------");

        }
        System.out.println("-----------------");
        double promedio = (sumacalif/repeticiones);
        System.out.println("Su promedio es: " + promedio);
        System.out.println("-----------------");




            }
    }

        //********Opcion con contador******** */
        /* int contador = 0;
        while(contador!=repeticiones){
            int venta = Integer.parseInt(console.readLine("Ingrese su cifra de ventas: "));
            if (venta > 10000) {
                System.out.println("Su comisión es de: " + (venta * 0.3) + ", correspondiente al 30%");
            } else if (venta >= 5000 && venta <= 9999) {
                System.out.println("Su comisión es de: " + (venta * 0.2) + ", correspondiente al 20%");
            } else if (venta >= 1001 && venta <= 4999) {
                System.out.println("Su comisión es de: " + (venta * 0.1) + ", correspondiente al 10%");
            } else {
                System.out.println("A usted no le corresponde comisión");
            }
            System.out.println(contador);
            contador++;
            System.out.println(contador);
        } */

        //********Opcion sin contador******** */
        
        /* while(repeticiones!=0){
            int venta = Integer.parseInt(console.readLine("Ingrese su cifra de ventas: "));
            if (venta > 10000) {
                System.out.println("Su comisión es de: " + (venta * 0.3) + ", correspondiente al 30%");
            } else if (venta >= 5000 && venta <= 9999) {
                System.out.println("Su comisión es de: " + (venta * 0.2) + ", correspondiente al 20%");
            } else if (venta >= 1001 && venta <= 4999) {
                System.out.println("Su comisión es de: " + (venta * 0.1) + ", correspondiente al 10%");
            } else {
                System.out.println("A usted no le corresponde comisión");
            }
            repeticiones--;
            System.out.println(repeticiones);
            */

