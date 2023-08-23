import java.util.Scanner;

public class Triangulos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el valor del lado A");
        float ladoA = sc.nextFloat();
        System.out.println("Ingrese el valor del lado B");
        float ladoB = sc.nextFloat();
        System.out.println("Ingrese el valor del lado C");
        float ladoC = sc.nextFloat();
// Para identificar caul tipo de triangulo es debemos saber si se puede formar un triangulo
        if (ladoC + ladoB <= ladoA || ladoB + ladoA <= ladoC || ladoA + ladoC <= ladoB) {
            System.out.println("Triángulo Inválido");
        }
        if ((ladoA + ladoB > ladoC && ladoA == ladoB && ladoA != ladoC) || (ladoA + ladoC > ladoB && ladoA == ladoC && ladoA != ladoB) || (ladoC + ladoB > ladoA && ladoB == ladoC && ladoB != ladoA)) {
            System.out.println("Es un triangulo isósceles");
        }
        if ((ladoA + ladoB > ladoC && ladoA != ladoB) && (ladoB + ladoC > ladoA && ladoB != ladoC) && (ladoA + ladoC > ladoB && ladoA != ladoC)) {
            System.out.println("Es un triangulo escaleno");
        }
        if (ladoA + ladoB > ladoC && ladoA == ladoB && ladoA + ladoC > ladoB && ladoA == ladoC && ladoB + ladoC > ladoA && ladoB == ladoC) {
            System.out.println("Es un triangulo equilatero");
        }

    }
}
