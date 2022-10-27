import java.io.Console;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class EjercicioHechoPorProfe {

    public static void main(String[] args) {
        Map<String, ArrayList> libroClases = new HashMap<String, ArrayList>();
        Console console = System.console();
        System.out.println("*****Bienvenido*****");
        int cantidadAlumnos = Integer.parseInt(console.readLine("Ingrese cantidad de alumnos a ingresar: "));
        while (cantidadAlumnos != 0) {
            String nombre = console.readLine("Ingrese nombre del alumne: ");
            ArrayList<Float> notas = new ArrayList<Float>();
            for (int i = 1; i <= 3; i++) {
                Float nota = Float.parseFloat(console.readLine("Ingrese nota " + i + ": "));
                if (nota >= 1 && nota <= 7) {
                    notas.add(nota);
                } else {
                    System.out.println("Ingrese nota valida: ");
                    i--;
                }
            }
            libroClases.put(nombre, notas);
            cantidadAlumnos--;
        }
        System.out.println(libroClases);
        for (String i : libroClases.keySet()) { // aca se recorre por cada alumno
            float suma = 0.0f;
            for (Object x : libroClases.get(i)) { // aca se recorre por cada nota del alumno
                suma = (Float) x + suma;
            }

            float promedioUnDecimal = suma / 3;
            float scale = (float) Math.pow(10, 1);
            float doubleM1 = Math.round(promedioUnDecimal * scale) / scale;
            System.out.println("El promedio de: " + i + " fue de: " + +doubleM1);
        }

    }
}
/*
 * double d = 9.4568982982989;
 * double scale = Math.pow(10, 1);
 * double doubleM1 = Math.round(d*scale)/scale;
 * System.out.println("Math1 Rounded off: "+doubleM1);
 * double d = promedioUnDecimal;
 * double scale = Math.pow(10, 1);
 * double doubleM1 = Math.round(d*scale)/scale;
 * System.out.println("Math1 Rounded off: "+doubleM1);
 */

/*
 * PARA TRUNCAR
 * double d = 9.4568982982989;
 * double scale = Math.pow(10, 3);
 * double doubleM1 = Math.round(d*scale)/scale;
 * System.out.println("Math1 Rounded off: "+doubleM1);
 * 
 * double d = 9.4568982982989;
 * String pattern = "#.###";
 * DecimalFormat decimalFormat = new DecimalFormat(pattern);
 * String formattedDouble = decimalFormat.format(d);
 * System.out.println("Formatted double d = "+formattedDouble);
 */
