import java.util.*;
public class Ejercicio05 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre del Jugador 1: ");
        String jugador1 = sc.nextLine();
        System.out.println("Ingrese el nombre del Jugador 2 : ");
        String jugador2 = sc.nextLine();
        System.out.println("Ingrese el número de soldados del jugador uno: ");
        System.out.println("Solo se permite hasta 5 soldados en la batalla");
        int num1 = sc.nextInt();
        if(num1 > 5){
            System.out.println("Solo se permite numeros del 1 al 5");
        } 
            
        System.out.println("Ingrese el número de soldados del jugador dos: ");
        int num2 = sc.nextInt();
        if(num2 > 5){
            System.out.println("Solo se permite numeros del 1 al 5");
        }
        
        String[] soldados1 = new String[num1];
        String[] soldados2 = new String[num2];
        System.out.println("soldados jugador 1");
        sold1(soldados1);
        System.out.println("Soldados jugador 2");
        sold2(soldados2);
        impGanador(num1, num2, jugador1, jugador2);
        
    }
    public static void sold1(String[] soldados1){
        for(int i = 0; i < soldados1.length; i++){
            System.out.println("Soldado0" + (i + 1));
        }
    }
    public static void sold2(String[] soldados2){
        for(int i = 0; i < soldados2.length; i++){
            System.out.println("Soldado0" + (i + 1));
        }
    }
    public static void impGanador(int num1, int num2, String jugador1, String jugador2){
        if(num1 > num2){
          System.out.println("ganó: " + jugador1);
        }
        if(num1 == num2){
          System.out.println("Empate");  
        } 
        if(num1 < num2){
          System.out.println("ganó: " + jugador2);  
        }  
        
    }
}
