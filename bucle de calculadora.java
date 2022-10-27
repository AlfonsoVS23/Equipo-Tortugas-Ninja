import java.io.Console;

public class Desafio2 {
    static Double Suma(double num1, double num2){
        double resultado = num1 + num2;
        return resultado;
    }
    static Double Resta(double num1, double num2){
        double resultado = num1 - num2;
        return resultado;
    }
    static Double Multiplicacion(double num1, double num2){
        double resultado = num1 * num2;
        return resultado;
    }
    static Double Division(double num1, double num2){
      double resultado = num1 / num2;
      return resultado;  
        //if(num2==0){
          //  return "Ingrese numero valido";
        //}else{
          //  double resultado = num1 / num2;
            //return "El resultado de la division es: " + resultado;
           
        //}
        
    }   
    /**
     * @param args
     */
    public static void main(String[] args) {
        Console console = System.console();
        int opcion = Integer.parseInt(console.readLine("Ingrese opcion: \n 1 para suma, 2 para resta,3 para multiplicacion,4 para division, 5 para salir: "));
        System.out.println(opcion);
        if (opcion == 1) {
            double num1 = Double.parseDouble(console.readLine ("Ingrese numero 1:"));
            double num2 = Double.parseDouble(console.readLine ("Ingrese numero 2:"));
            double resultado = Suma(num1, num2);
            System.out.println(resultado);
        } else if(opcion == 2) {
            double num1 = Double.parseDouble(console.readLine ("Ingrese numero 1:"));
            double num2 = Double.parseDouble(console.readLine ("Ingrese numero 2:"));
            double resultado = Resta(num1, num2);
            System.out.println(resultado);
        } else if(opcion == 3) {
            double num1 = Double.parseDouble(console.readLine ("Ingrese numero 1:"));
            double num2 = Double.parseDouble(console.readLine ("Ingrese numero 2:"));
            double resultado = Multiplicacion(num1, num2);
            System.out.println(resultado);
    } else if(opcion == 4) {
        double num1 = Double.parseDouble(console.readLine ("Ingrese numero 1:"));
        double num2 = Double.parseDouble(console.readLine ("Ingrese numero 2:"));
        if (num2 == 0) {
            System.out.println("Ingrese num valido: ");
        }else{
            double resultado = Division(num1, num2);
            System.out.println(resultado);
        }
        
}
    }
}
