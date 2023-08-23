import java.util.Scanner;

public class SetTennis {
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
        // JugadorA gana si: hace 6 juegos o llega a 7,
        // JugadorB gana si: hace 6 juegos o llega 7,
        // Aun no se acaba el set si jugadorA o jugadorB no pasan de 6,
        // El set es invalido cuando un jugador llega a 7 y el otro no llega a 5
        if ((jugadorA < 0 || jugadorB < 0) ||
                (jugadorB == maxJuegos && jugadorA < juegos) ||
                (jugadorA == maxJuegos && jugadorB < juegos)) {
            System.out.println("invalido");

        } else {
            if (jugadorA >= juegos && jugadorA > jugadorB + 1) {
                ganador = true;
                System.out.println("Gana jugador A");
            }

            if (jugadorB >= juegos && jugadorB > jugadorA + 1) {
                ganador = true;
                System.out.println("Gana jugador B");
            }

            if (!ganador) {
                System.out.println("El set aun no termina");
            }
        }
    }
}






