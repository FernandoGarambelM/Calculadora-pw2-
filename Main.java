import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean menuActivo = true;

        while(menuActivo){
            opciones();
            System.out.println("Ingrese su elección: ");
            int seleccion = sc.nextInt();
            ejecutarSeleccion(seleccion);
        }
    }

    public static void opciones(){
        System.out.println("OPCIONES DELA CALCULADORA:" + 
        "1. SUMA " +
        "2. RESTA " +
        "3. MULTIPLICACION " +
        "4. DIVISION " +
        "5. MODULO "+
        "6. SALIR");
    }

    public static void ejecutarSeleccion(int x){
        Calculator calculadora = new Calculator();
        switch (x) {
            case 1: 
                break;
            case 2: 
                break;
            case 3: 
                break;
            case 4: 
                break;
            case 5: 
                break;
            case 6: calculadora.sumar(); 
                break;
            
            default: System.out.println("El número igresado es incorrecto");
                break;
        }
    }
}