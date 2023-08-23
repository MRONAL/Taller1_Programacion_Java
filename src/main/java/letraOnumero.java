import java.util.Scanner;

public class letraOnumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un valor: ");

        String input = sc.next();
        int asciiValue = (int) input.charAt(0);

        if ((asciiValue >= 65 && asciiValue <= 90) || (asciiValue >= 97 && asciiValue <= 122)) {
            System.out.println("Es una letra.");

            if (asciiValue >= 65 && asciiValue <= 90) {
                System.out.println("Es una letra mayúscula.");
            } else {
                System.out.println("Es una letra minúscula.");
            }
        } else if (asciiValue >= 48 && asciiValue <= 57) {
            System.out.println("Es un número.");
        } else {
            System.out.println("No es ni una letra ni un número.");
        }

        System.out.println("Valor ASCII/numérico: " + asciiValue);
    }
}