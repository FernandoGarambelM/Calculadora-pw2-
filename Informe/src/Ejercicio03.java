import java.util.Scanner;

public class Ejercicio03 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] soldados = new String[5];
        for(int i = 0; i < soldados.length; i++){
            System.out.println("ingrese el nombre del soldado " + (i + 1));
            soldados[i] = sc.nextLine();
        }
        String[] imp = new String[5];
        System.out.println("El nombre de los Soldados son: ");
        for(int i = 0; i < soldados.length; i++){
            imp[i] = soldados[i];
            System.out.println("Soldado N°" + (i + 1) + ": \n" + imp[i]);
        }
    }
}
