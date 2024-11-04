import java.util.Scanner;

public class Lista {
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Quantidade de Atletas: ");
		int    qntd = sc.nextInt();
		sc.nextLine();
		
		    String[] nomes = new String[qntd];
	        String[] sexos = new String[qntd];
	        double[] alturas = new double[qntd];
	        double[] pesos = new double[qntd];
	        
	        double somaPesos = 0;
	        double somaAltMulheres = 0;
	        int    contaMulheres = 0;
	        String maisAlto = "";
	        double altMaior = 0;
	        
		for (int i = 0; i < qntd; i++) {
		
		System.out.printf("Digite os dados do atleta numero %d: \n", i + 1);
		
		System.out.print("Digite o nome: ");
		nomes[i] = sc.nextLine().trim().toUpperCase();
		
		while (true) {
			System.out.print("Digite o sexo: (M ou F): ");
			sexos[i] = sc.nextLine().trim().toUpperCase();
			
            if (sexos[i].equals("M") || sexos[i].equals("F")) {
            	break;
            } else {
                System.out.print("Valor inválido! Favor digitar M ou F: ");
                
            }
		}
		
		while (true) {
            System.out.print("Digite a altura: ");
            alturas[i] = sc.nextDouble();
            
	    	if (alturas[i] > 0) {
	    		break;
	    } else {
         System.out.print("Valor inválido! Favor digitar um valor positivo: ");
	                           
		}
		}
		
		while (true) {
            System.out.print("Digite seu peso: ");
            pesos[i] = sc.nextDouble();
            
	    	if (pesos[i] > 0) {
	    		sc.nextLine();
	    		break;
	    } else {
         System.out.print("Valor inválido! Favor digitar um valor positivo: ");
	    }
	    } 
	    	somaPesos += pesos[i];
	    	
	    	 if (sexos[i].equals("F")) {
	                somaAltMulheres += alturas[i];
	                contaMulheres++;
	    	 }
	            if (alturas[i] > altMaior) {
	                altMaior = alturas[i];
	                maisAlto = nomes[i];
	            }

		}
		sc.close();
		
		 double pesoMedia = somaPesos / qntd;
		
	        int contaMasc = 0;
	         for (int i = 0; i < qntd; i++) {
	             if (sexos[i].equals("M")) {
	                 contaMasc++;
	             }
	         }
	    double porcMasc = (double) contaMasc / qntd * 100; 
	    double altMediaMulheres = contaMulheres > 0 ? somaAltMulheres / contaMulheres : 0;		
		System.out.println("###RELATÓRIO###");
		System.out.printf("Peso médio dos atletas: %.2fkg \n", pesoMedia);
		System.out.printf("Atleta mais alto(a): %s (%.2fm)\n", maisAlto, altMaior);
		System.out.printf("Porcentagem de homens: %.1f%%%n", porcMasc);
		if (contaMulheres > 0) {
            System.out.printf("Altura média das mulheres: %.2f m\n", altMediaMulheres);
        } else {
            System.out.println("Não há mulheres cadastradas.");
        }
		}
}
