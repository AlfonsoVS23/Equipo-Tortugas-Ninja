import java.io.Console;

public class BucleDeCalculadora {
    static Double Suma(double num1, double num2) {
        double resultado = num1 + num2;
        return resultado;
    }

    static Double Resta(double num1, double num2) {
        double resultado = num1 - num2;
        return resultado;
    }

    static Double Multiplicacion(double num1, double num2) {
        double resultado = num1 * num2;
        return resultado;
    }

    static Double Division(double num1, double num2) {
        double resultado = num1 / num2;
        return resultado;
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        Console console = System.console();
        int opcion = 0;
        System.out.println(opcion);
        while (opcion != 5) {
            opcion = Integer.parseInt(console.readLine(
                    "Ingrese opcion: \n 1 para suma, 2 para resta,3 para multiplicacion,4 para division, 5 para salir: "));
            if (opcion >= 1 && opcion <= 4) {
                double num1 = Double.parseDouble(console.readLine("Ingrese numero 1:"));
                double num2 = Double.parseDouble(console.readLine("Ingrese numero 2:"));
                if (opcion == 1) {
                    double resultado = Suma(num1, num2);
                    System.out.println(resultado);
                } else if (opcion == 2) {

                    double resultado = Resta(num1, num2);
                    System.out.println(resultado);
                } else if (opcion == 3) {

                    double resultado = Multiplicacion(num1, num2);
                    System.out.println(resultado);
                } else if (opcion == 4) {
                    while (num2 == 0) {
                        num2 = Double.parseDouble(console.readLine("Ingrese numero 2:"));
                    }
                    double resultado = Division(num1, num2);
                    System.out.println(resultado);
                }

            } else if (opcion > 5 || opcion < 0) {
                opcion = Integer.parseInt(console.readLine(
                        "Ingrese opcion: \n 1 para suma, 2 para resta,3 para multiplicacion,4 para division, 5 para salir: "));
            } else {
                opcion = 5;
            }

        }
    }

}
