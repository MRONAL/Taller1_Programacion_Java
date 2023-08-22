import java.util.Scanner;

public class SetTennis2 {
    public static void main(String[] args) {
        // Se crea un objeto tipo escaner que recibe ingresos del sistema
        Scanner sc = new Scanner(System.in);
        // Se guarda los datos ingresados en una variable tipo int
        System.out.println("Juegos ganados por A: ");
        int jugadorA = sc.nextInt();

        System.out.println("Juegos ganados por B: ");
        int jugadorB = sc.nextInt();
        // Cantidad máxima de juegos
        int maxJuegos = 7;
        int juegos = 6;
        boolean ganador = false;
        boolean invalido = true;
        if (jugadorA < 5 && jugadorB == maxJuegos || jugadorA == maxJuegos && jugadorB < 5) {
            System.out.println("Invalido");
            return;
        } else {
            if ((jugadorA <= juegos || jugadorA == maxJuegos) && (jugadorB <= juegos || jugadorB == maxJuegos)) {
                System.out.println("Aun no termina");
            }
            if (jugadorA == juegos && jugadorA - jugadorB >= 2) {
                System.out.println("Gana jugador A");
            }
            if (jugadorB == juegos && jugadorB - jugadorA >= 2) {
                System.out.println("Gana jugador B");
            }
        }
    }

}

