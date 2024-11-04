import java.util.Scanner;

public class BarTeste {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
               
        System.out.print("Sexo (F ou M): ");
        String sexo = scanner.nextLine().trim().toUpperCase();
        
        System.out.print("Quantidade de cervejas: ");
        int qtdCerveja = scanner.nextInt();
        
        System.out.print("Quantidade de refrigerantes: ");
        int qtdRefri = scanner.nextInt();
        
        System.out.print("Quantidade de espetinhos: ");
        int qtdEspeto = scanner.nextInt();
        
        double precoCerveja = 5;
        double precoRefri = 3;
        double precoEspeto = 7;
        double ingresso = sexo.equals("F") ? 8 : 10;
        double couvert = 4;
        
        double consumo = (qtdCerveja * precoCerveja) + (qtdRefri * precoRefri) + (qtdEspeto * precoEspeto);
        
        if (consumo > 30) {
            couvert = 0;
        }
        
        double totalAPagar = consumo + ingresso + couvert;

        System.out.println("RELATÓRIO:");
        System.out.printf("Consumo = R$ %.2f%n", consumo);
        
        if (couvert == 0) {
            System.out.println("Isento de Couvert");
        } else {
            System.out.printf("Couvert = R$ %.2f%n", couvert);
        }
        
        System.out.printf("Ingresso = R$ %.2f%n", ingresso);
        System.out.printf("Valor a pagar = R$ %.2f%n", totalAPagar);
        
        scanner.close();
    }
}
