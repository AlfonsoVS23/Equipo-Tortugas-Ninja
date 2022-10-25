import java.io.Console;

public class DesafioBucle1 {
    public static void main (String [] args){
        Console console = System.console();
        System.out.println("**********************");
        int repeticiondiametro = Integer.parseInt(console.readLine( "Ingrese la cantidad de veces del diámetro a calcular: "));
        System.out.println("**********************");

        for(int i = 0; i < repeticiondiametro ; i++){
        String sdiametro = console.readLine( "inserte el diámetro: ");
        Double diametro = Double.parseDouble(sdiametro);
        Double radio = (diametro / 2);
        Double area = ((radio* radio * Math.PI));
        Double perimetro = (2 * Math.PI * radio);
        
        System.out.println("*");
        System.out.println("*");
        System.out.println("el area es: " + area);
        System.out.println("el perimetro es: " + perimetro);
        System.out.println("*");
        System.out.println("*");
        }
    }
}
//     for(int i = 0; i < repeticiones ; i++){
//     int venta = Integer.parseInt(console.readLine("Ingrese su cifra de ventas: "));
//     if (venta > 10000) {
//         System.out.println("Su comisión es de: " + (venta * 0.3) + ", correspondiente al 30%");
//     } else if (venta >= 5000 && venta <= 9999) {
//         System.out.println("Su comisión es de: " + (venta * 0.2) + ", correspondiente al 20%");
//     } else if (venta >= 1001 && venta <= 4999) {
//         System.out.println("Su comisión es de: " + (venta * 0.1) + ", correspondiente al 10%");
//     } else {
//         System.out.println("A usted no le corresponde comisión");
