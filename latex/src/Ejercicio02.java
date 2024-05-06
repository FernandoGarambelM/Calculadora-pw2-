import java.util.*;
public class Ejercicio02 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre de los soldados: ");
        String soldado1 = sc.nextLine();
        String soldado2 = sc.nextLine();
        String soldado3 = sc.nextLine();
        String soldado4 = sc.nextLine();
        String soldado5 = sc.nextLine();

        System.out.println("Nombre del soldado: " + soldado1 + "\n" + "Vida: 15");
        System.out.println("Nombre del soldado: " + soldado2 + "\n" + "Vida: 20");
        System.out.println("Nombre del soldado: " + soldado3 + "\n" + "vida: 10");
        System.out.println("Nombre del soldado: " + soldado4 + "\n" + "vida: 5");
        System.out.println("Nombre del soldado: " + soldado5 + "\n" + "vida: 13");
    }   
}