import java.util.Arrays;
import java.util.Scanner;

public class JogoDaVelhaTabela {
    public static void main(String[] args) {

        String matriz[][] = null ;
        matriz = new String[3][3];
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira os elementos: ");

        for(int i=0; i<3; i++) {
            for(int j=0; j<3; j++) {
                matriz[i][j] = sc.next();
            }
        }

        for (int i=0; i < matriz.length; i++) {
            for (int j=0; j < matriz[i].length; j++) {
                if (j < 2) {
                    System.out.printf(" %s |", matriz[i][j]);
                } else {
                    System.out.printf(" %s \n", matriz[i][j]);
                }
            }
        }

    }

}