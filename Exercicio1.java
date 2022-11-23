import java.util.Scanner;

public class Exercicio1 {
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

        int menor = numerosLista[0];
        int maior = numerosLista[0];
        for(int j=0; j<limite; j++) {
            if(numerosLista[j] > maior)
                maior = numerosLista[j];
            else if (numerosLista[j] < menor)
                menor = numerosLista[j];
        }

        System.out.println(menor);
        System.out.println(maior);
    }
}
