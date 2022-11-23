import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a quantidade de números que você quer digitar: ");
        int limite = sc.nextInt();
        int[] numerosLista = new int[limite];

        for(int i = 0; i < limite; i++) {
            System.out.printf("Digite um número: ");
            int numero = sc.nextInt();
            numerosLista[i] = numero;
        }

        System.out.println("Os números repetidos foram: ");
        int contador = 1;
        for (int i = 0; i < numerosLista.length - 1; i++) {
            if (numerosLista[i] == numerosLista[i + 1]) {
                contador++;
            } else {
                if (contador > 1) {
                    System.out.println("- " + numerosLista[i] + ": repetido " + contador + " vezes.");
                }
                contador = 1;
            }
        }

    }
}
