import java.io.Console;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class DesafioAlumnos {
    public static void main(String[] args) {
            Console console = System.console();
            int cantalumnos = Integer.parseInt(console.readLine( "Ingrese el n° de alumnos: \n"));
            ArrayList<Integer> listanotas = new ArrayList<Integer>();
            ArrayList<String> listanombres = new ArrayList<String>();



            /*
             *  //Formas de rocorrer hashMap
                Map<String, ArrayList> miHashMap = new HashMap <String, ArrayList>();
                miHashMap.put("Tenis", miArrayString);
                miHashMap.put("Futbol", miArray);
                System.out.println(miHashMap);
             */

        
            for(int i=0; i<cantalumnos;i++){
            String nombrealumno = console.readLine( "Ingrese su nombre: \n");
            int valores = Integer.parseInt(console.readLine("Por favor ingrese su nota: \n"));
            listanotas.add(valores);
            listanombres.add(nombrealumno);
            }
            System.out.println("----------------------------------------");
            System.out.println(listanotas);
            System.out.println("----------------------------------------");
            System.out.println(listanombres);

            Map<String, ArrayList> minotasMap = new HashMap <String, ArrayList>();
            
            minotasMap.put("Nombre de Alumnos" , listanombres);
            minotasMap.put("Nota Alumnos" , listanotas);
            System.out.println(minotasMap);
            /*minotasMap.forEach((k,v) -> System.out.println("key: " + k + " Value: " + v
            ));*/
            /*DUDA DUDOSA, COMO HACER QUE LISTANOMBRE QUEDE CON LISTA NOTA EN UN MISMO ARRAY EJ: [ARIEL:10, CONO:2] */


            } 
        {
    }
}

/* vamos a pedirle al usuario la cantidad de alunos que va a ingresar 
pedir por cada alumno el nombre y que ingrese 3 notas por alumno (guardar en arrayList)
estos valores se van aguardar en un hashMap en donde la llave será el nombre del alumno y
el valor será el arreglo con sus 3 notas 
 */