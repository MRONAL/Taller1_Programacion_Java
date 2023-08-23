import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el primer número entero: ");
        int num1 = sc.nextInt();

        System.out.print("Ingrese el segundo número entero: ");
        int num2 = sc.nextInt();

        if (num2 != 0) {
            int division = num1 / num2;
            int resto = num1 % num2;

            System.out.println("Resultado de la división: " + division);
            System.out.println("Residuo de la división: " + resto);

            if (resto == 0) {
                System.out.println("La división es exacta.");
            } else {
                System.out.println("La división no es exacta.");
            }
        } else {
            System.out.println("El segundo número debe ser distinto de cero para realizar la división.");
        }
    }
}
