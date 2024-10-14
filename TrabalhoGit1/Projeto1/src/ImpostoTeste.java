import java.util.Scanner;

public class ImpostoTeste {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Renda anual com salário: ");
        double rendaSalario = scanner.nextDouble();
        
        System.out.print("Renda anual com prestação de serviço: ");
        double rendaServico = scanner.nextDouble();
        
        System.out.print("Renda anual com ganho de capital: ");
        double rendaGanhoCaptl = scanner.nextDouble();
        
        System.out.print("Gastos médicos: ");
        double gastosMed = scanner.nextDouble();
        
        System.out.print("Gastos educacionais: ");
        double gastosEduc= scanner.nextDouble();

        double impostoSalario = calcularImpostoSalario(rendaSalario);
        double impostoServico = calcularImpostoServico(rendaServico);
        double impostoGanhoCaptl = calcularImpostoGanhoCapital(rendaGanhoCaptl);
        
        double maxDeducoes = Math.min(gastosMed + gastosEduc, 0.3 * (impostoSalario + impostoServico + impostoGanhoCaptl));
        double gastosDedutiveis = gastosMed + gastosEduc;
        double impostoBrutoTotal = impostoSalario + impostoServico + impostoGanhoCaptl;
        double impostoDevido = impostoBrutoTotal - maxDeducoes;

        System.out.println("RELATÓRIO DE IMPOSTO DE RENDA");
        System.out.println(" CONSOLIDADO DE RENDA:");
        System.out.printf("Imposto sobre salário: %.2f%n", impostoSalario);
        System.out.printf("Imposto sobre serviços: %.2f%n", impostoServico);
        System.out.printf("Imposto sobre ganho de capital: %.2f%n", impostoGanhoCaptl);
        System.out.println("DEDUÇÕES:");
        System.out.printf("Máximo dedutível: %.2f%n", maxDeducoes);
        System.out.printf("Gastos dedutíveis: %.2f%n", gastosDedutiveis);   
        System.out.println("RESUMO:");
        System.out.printf("Imposto bruto total: %.2f%n", impostoBrutoTotal);
        System.out.printf("Abatimento: %.2f%n", maxDeducoes);
        System.out.printf("Imposto devido: %.2f%n", impostoDevido);

        scanner.close();
    }

    private static double calcularImpostoSalario(double rendaSalario) {
        double salarioMensal = rendaSalario / 12;
        if (salarioMensal < 3000) {
            return 0;
        } else if (salarioMensal < 5000) {
            return rendaSalario * 0.1;
        } else {
            return rendaSalario * 0.2;
        }
    }
    private static double calcularImpostoServico(double rendaServico) {
        return rendaServico * 0.15;
    }
    private static double calcularImpostoGanhoCapital(double rendaGanhoCaptl) {
        return rendaGanhoCaptl * 0.2;
    }
}
