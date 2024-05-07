import java.util.*;
class Ejercicio04{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] name = new String[5];
        int[] leave = new int[5];
        System.out.println("Ingrese los datos de los soldados: ");
        name = pedirName(name);
        leave = pedirLeave(leave);
        impr(leave, name);

    }
    public static String[] pedirName(String[] name){
        Scanner sc = new Scanner(System.in);
        for(int i = 0;i < name.length; i++ ){
            System.out.println("Nombre del soldado Numero. " + (i + 1));
            name[i] = sc.nextLine();
        }

        return name;
    }
    public static int[] pedirLeave(int[] leave){
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < leave.length; i++){
            System.out.println("Ingrese la vida del soldado Número. " + (i + 1));
            leave[i] = sc.nextInt();
        }
        return leave;
    }
    public static void impr(int[] leave, String[] name){
        System.out.println("Los datos de los soldados son: ");
        for(int i = 0; i < 5; i++){
            System.out.println("Nombre del soldado Número." + (i+1) + ": \n"  + name[i]);
            System.out.println("Vida del soldado Nuemro." + (i + 1) + ": \n" + leave[i]);
        }
    }
}
