import java.util.Scanner;

public class Fiz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== 🎯 Desafío FizzBuzz Mejorado ===");
        System.out.print("👉 Ingresa el número inicial: ");
        int inicio = sc.nextInt();

        System.out.print("👉 Ingresa el número final: ");
        int fin = sc.nextInt();

        System.out.println("\n✨ Resultados FizzBuzzBoom:\n");

        for (int i = inicio; i <= fin; i++) {
            String resultado = "";

            // Concatenamos los textos según los múltiplos
            if (i % 3 == 0) resultado += "Fizz";
            if (i % 5 == 0) resultado += "Buzz";
            if (i % 7 == 0) resultado += "Boom";

            // Si no hubo coincidencias, mostramos el número
            System.out.println(resultado.isEmpty() ? i : resultado);
        }

        sc.close();
    }
}
