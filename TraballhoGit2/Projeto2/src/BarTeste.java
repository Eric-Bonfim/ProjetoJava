import java.util.Scanner;

public class BarTeste {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Dados de entrada
        System.out.print("Sexo (F ou M): ");
        String sexo = scanner.nextLine().trim().toUpperCase();
        
        System.out.print("Quantidade de cervejas: ");
        int qtdCerveja = scanner.nextInt();
        
        System.out.print("Quantidade de refrigerantes: ");
        int qtdRefri = scanner.nextInt();
        
        System.out.print("Quantidade de espetinhos: ");
        int qtdEspeto = scanner.nextInt();
        
        // Preços
        double precoCerveja = 5.0;
        double precoRefri = 3.0;
        double precoEspeto = 7.0;
        double ingresso = sexo.equals("F") ? 8.0 : 10.0;
        double couvert = 4.0;
        
        // Cálculo do consumo
        double consumo = (qtdCerveja * precoCerveja) + 
                         (qtdRefri * precoRefri) + 
                         (qtdEspeto * precoEspeto);
        
        // Verifica se o couvert artístico deve ser cobrado
        if (consumo > 30.0) {
            couvert = 0.0; // Isento de couvert
        }
        
        // Cálculo do valor total a pagar
        double totalAPagar = consumo + ingresso + couvert;
        
        // Exibição do relatório
        System.out.println("RELATÓRIO:");
        System.out.printf("Consumo = R$ %.2f%n", consumo);
        
        if (couvert == 0.0) {
            System.out.println("Isento de Couvert");
        } else {
            System.out.printf("Couvert = R$ %.2f%n", couvert);
        }
        
        System.out.printf("Ingresso = R$ %.2f%n", ingresso);
        System.out.printf("Valor a pagar = R$ %.2f%n", totalAPagar);
        
        // Fecha o scanner
        scanner.close();
    }
}
