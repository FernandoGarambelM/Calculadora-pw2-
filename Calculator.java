import java.util.*;
public class Calculator {
    Scanner sc = new Scanner(System.in);

    //SUMAR
    int add(int a, int b){
        int resultado = a + b;
        return resultado;
    }
    public void sumar(){
        System.out.println("Ingrese los dos numeros a sumar: ");
        System.out.print("Numero 1: ");
        int a = sc.nextInt();
        System.out.print("Numero 2: ");
        int b = sc.nextInt();
        int resultado = add(a, b);
        System.out.println("El resultado de la suma es: " + resultado + "\n");
    }
    //RESTAR
    int sub(int a, int b){
        int resultado = a - b;
        return resultado; 
    }
    public void restar(){
        System.out.println("Ingrese los dos numeros a restar: ");
        System.out.print("Numero 1: ");
        int a = sc.nextInt();
        System.out.print("Numero 2: ");
        int b = sc.nextInt();
        int resultado = sub(a, b);
        System.out.println("El resultado de la resta es: " + resultado + "\n");
    }
    

    //MULTIPLICACION
    int mul(int a, int b){ 
        return 0; }

    //DIVIDIR
    public static double dividirNumeros(double dividendo, double divisor) {
        if (divisor == 0) {
            System.out.println("Error: No se puede dividir por cero.");
            return Double.NaN; // Devuelve NaN (Not a Number) si se intenta dividir por cero
        }
        
        return dividendo / divisor;
    }

    //MODULO
    int mod(int a, int b){ return 0; }

}