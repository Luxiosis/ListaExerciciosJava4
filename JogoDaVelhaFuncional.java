import java.util.Scanner;

public class JogoDaVelhaFuncional {
    public static void main(String args[]) {
	    Scanner entrada = new Scanner(System.in);
	    
	    String[][] tabela = {{" ", " ", " "}, {" ", " ", " "}, {" ", " ", " "}};
	    int turnos = 0;
	    
	    while(true) {
		    Scanner jogador1Entrada = new Scanner(pedirEntrada(entrada, tabela, 1));
		    tabela[jogador1Entrada.nextInt() - 1][jogador1Entrada.nextInt() - 1] = "X";
		    jogador1Entrada.close();
		    turnos++;
		    imprimirTabela(tabela);
		    
		    if(turnos == 9 && !checarVencedor(tabela)) {
		    	System.out.println("Empate");
		    	break;
		    }
		    
		    if(checarVencedor(tabela)) {
		    	System.out.println("Jogador 1 venceu!");
	    		break;
		    }
		    
		    Scanner jogador2Entrada = new Scanner(pedirEntrada(entrada, tabela, 2));
		    tabela[jogador2Entrada.nextInt() - 1][jogador2Entrada.nextInt() - 1] = "O";
		    jogador2Entrada.close();
		    turnos++;
		    imprimirTabela(tabela);
		    
		    if(checarVencedor(tabela)) {
		    	System.out.println("Jogador 2 venceu!");
		    	break;
		    }
	}
	
}

    public static boolean checarVencedor(String[][] tabela) {
	    for(int n = 0; n < tabela.length; n++) {
	    	if( (tabela[n][0] == "X" && tabela[n][1] == "X" && tabela[n][2] == "X") || 
	    	(tabela[n][0] == "O" && tabela[n][1] == "O" && tabela[n][2] == "O")) {
	    	    return true;
	    	}
	    						
	    }
	    
	    for(int n = 0; n < tabela.length; n++) {
	    	if( (tabela[0][n] == "X" && tabela[1][n] == "X" && tabela[2][n] == "X") || 
	    	(tabela[0][n] == "O" && tabela[1][n] == "O" && tabela[2][n] == "O") ) {
	    	    return true;	
	    	}
	    }
	    
	    if( (tabela[0][0] == "X" && tabela[1][1] == "X" && tabela[2][2] == "X") ||
	    (tabela[0][0] == "O" && tabela[1][1] == "O" && tabela[2][2] == "O") ) {
	        return true;
	    }
	    
	    if( (tabela[0][2] == "X" && tabela[1][1] == "X" && tabela[2][0] == "X") || 
	    (tabela[0][2] == "O" && tabela[1][1] == "O" && tabela[2][0] == "O") ) {
	        return true;
	    }
	    	
	    return false;
	    
    }

    public static String pedirEntrada(Scanner entrada, String[][] tabela, int jogador) {
	boolean verdade = true;
	int tabela_linha = 0, tabela_coluna = 0;
	while (verdade) {
		System.out.print("Jogador " + jogador + ", coloque o numero da posicao da coluna (1a, 2a, 3a) e posicao de linha (1a, 2a, 3a): ");
		tabela_linha = entrada.nextInt();
		
		while(true) {
			if(tabela_linha > 3 || tabela_linha < 1) {
				throw new java.lang.Error("NUMERO DIGITADO INVALIDO ");
			} else {
			    break;
			} 
		}
		tabela_coluna = entrada.nextInt();
		while(true) {
			if(tabela_coluna > 3 || tabela_coluna < 1) {
				throw new java.lang.Error("NUMERO DIGITADO INVALIDO ");
			} else {
			    break;	
			}
		}
		if(tabela[tabela_linha - 1][tabela_coluna - 1] == " ")
		 verdade = false;
	}
	return tabela_linha + " " + tabela_coluna;
}
    public static void imprimirTabela(String[][] tabela) {
	    System.out.printf("%s|%s|%s \n", tabela[0][0], tabela[0][1], tabela[0][2]);
	    System.out.println("-+-+-");
	    System.out.printf("%s|%s|%s \n", tabela[1][0], tabela[1][1], tabela[1][2]);
	    System.out.println("-+-+-");
	    System.out.printf("%s|%s|%s \n", tabela[2][0], tabela[2][1], tabela[2][2]);
}
    
}
