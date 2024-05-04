import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean menuActivo = true;

        while(menuActivo){
            opciones();
            System.out.println("\nIngrese su elección: ");
            int seleccion = sc.nextInt();
            ejecutarSeleccion(seleccion);
        }
    }

    public static void opciones(){
        System.out.println("\nOPCIONES DELA CALCULADORA: \n" + 
        "1. SUMA \n" +
        "2. RESTA \n" +
        "3. MULTIPLICACION \n" +
        "4. DIVISION \n" +
        "5. MODULO \n"+
        "6. SALIR");
    }

    public static void ejecutarSeleccion(int x){
        Calculator calculadora = new Calculator();
        switch (x) {
            case 1: calculadora.sumar();
                break;
            case 2: calculadora.restar();
                break; 
            case 3: 
                break;
            case 4: 
                break;
            case 5: 
                break;
            case 6: 
                break;
            
            default: System.out.println("El número igresado es incorrecto");
                break;
        }
    }
}