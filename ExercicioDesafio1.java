import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ExercicioDesafio1 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Digite o comprimento da lista: ");
        int limite = in.nextInt();

        String[] listaPalavras = new String[limite];
        for (int i = 0; i < limite; i++) {
            System.out.println("Digite a próxima palavra: ");
            listaPalavras[i] = in.next(); //O fato de ter next() e não nextLine() permite não ignorar loop
        }

        List<String> palavras = Arrays.asList(listaPalavras);
        String maior = "";
        for (String palavra : palavras) {
            if (palavra.length() > maior.length()) {
                maior = palavra;
            }
        }

        int tamanho = maior.length();
        int contador = 0;
        for (String j : listaPalavras) {
            if (j.length() == tamanho) {
                contador++;
            }
        }


        int penultimo = listaPalavras.length - 2;
        int ultimo = listaPalavras.length - 1;
        System.out.printf("As palavras recebidas foram:");
        for(int k = 0; k < listaPalavras.length; k++) {
            if(k < penultimo) {
                System.out.printf(" %s,", listaPalavras[k]);
            } else if (k == penultimo) {
                System.out.printf(" %s e ", listaPalavras[k]);
            } else if (k == ultimo){
                System.out.printf("%s.\n", listaPalavras[k]);
            }
        }

        if (contador == 1) {
            System.out.printf("A palavra com mais letras é \"%s\". ", maior);
        } else {
            System.out.println("Existem "+ contador + " palavras com " + maior.length() + " letras:");
            for (String j : listaPalavras) {
                if (j.length() == tamanho) {
                    System.out.println(j);
                }
            }
        }
    }
}
