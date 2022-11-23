import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a quantidade de nomes que você quer digitar (Tem que ser divisivel por 3): ");
        int limite = sc.nextInt();

        if (limite % 3 != 0) {
            System.out.println("Erro! Número tem que ser divisivel por 3!");
        } else {
            int quantidades = limite / 3;

            String[] nomesPedidos = new String[limite];
            for (int i = 0; i < limite; i++) {
                System.out.println("Digite o próximo nome: ");
                nomesPedidos[i] = sc.next(); //O fato de ter next() e não nextLine() permite não ignorar loop
            }

            List<String> nomesLista = Arrays.asList(nomesPedidos);
            Collections.shuffle(nomesLista);                               // Primeiro você transforma array em lista, embaralha
            String[] nomesEmbaralhados = nomesLista.toArray(nomesPedidos); // essa lista, e então transforma ela em array

            int indexador = 0;
            for (int j = 0; j < quantidades; j++) {
                int numeroGrupo = j + 1;
                System.out.printf("Grupo %d: \n", numeroGrupo);
                for (int k = 0; k < 3; k++) {
                    System.out.println(nomesEmbaralhados[indexador]);
                    indexador++;
                }
            }
        }
    }
}