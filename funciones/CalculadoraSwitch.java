import java.io.Console;

public class CalculadoraSwitch {

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

    public static void main(String[] args) {
        Console console = System.console();
        int opcion = 0;
        do {
            opcion = Integer.parseInt(console.readLine(
                    "Ingrese opcion: \n 1 para suma, 2 para resta,3 para multiplicacion,4 para division, 5 para salir: "));
            if (opcion >= 1 && opcion <= 4) {

                int num1 = Integer.parseInt(console.readLine("Ingrese numero1: "));
                int num2 = Integer.parseInt(console.readLine("Ingrese numero2: "));
                switch (opcion) {
                    case 1:
                        System.out.println(Suma(num1, num2));
                        break;
                    case 2:
                        System.out.println(Resta(num1, num2));
                        break;
                    case 3:
                        System.out.println(Multiplicacion(num1, num2));
                        break;
                    default:
                        System.out.println(Division(num1, num2));
                        break;
                }
            }
        } while (opcion != 5); // 5=5
    }
}
