import java.util.Scanner;

public class ordenamiento {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de números: ");
        int n = sc.nextInt();

        int[] numeros = new int[n];
        System.out.println("Ingrese los números:");

        for (int i = 0; i < n; i++) {
            numeros[i] = sc.nextInt();
        }

        // Ordenar usando el ciclo for
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (numeros[i] > numeros[j]) {
                    // Intercambiar números
                    int temp = numeros[i];
                    numeros[i] = numeros[j];
                    numeros[j] = temp;
                }
            }
        }

        System.out.println("Números ordenados de menor a mayor:");
        for (int num : numeros) {
            System.out.print(num + " ");
        }
    }
}
