public class Calculadora {
    static String Suma(int num1, int num2){
        int resultado = num1 + num2;
        return "El resultado de la suma es: " + resultado;
    }
    static String Resta(int num1, int num2){
        int resultado = num1 - num2;
        return "El resultado de la resta es: " + resultado;
    }
    static String Multiplicacion(int num1, int num2){
        int resultado = num1 * num2;
        return "El resultado de la multiplicacion es: " + resultado;
    }
    static String Division(float num1, float num2){
        
        if(num2==0){
            return "Ingrese numero valido";
        }else{
            float resultado = num1 / num2;
            return "El resultado de la division es: " + resultado;
           
        }
        
    }        

    public static void main(String[] args) {
        System.out.println(Suma(4,8));
        System.out.println(Resta(4,7));
        System.out.println(Multiplicacion(4,7));
        System.out.println(Division(4.8f,0.0f));

        
    }
}
