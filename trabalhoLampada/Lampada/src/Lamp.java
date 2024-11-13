public class Lamp {
    private String marca;
    private String volts;
    private String tipo;
    private String modelo;
    private String cor;
    private double preco;
    private String garant;
    private boolean ligada;

    public Lamp(String marca, String volts, String tipo, String modelo, String cor, double preco, String garant) {
        this.marca = marca;
        this.volts = volts;
        this.tipo = tipo;
        this.modelo = modelo;
        this.cor = cor;
        this.preco = preco;
        this.garant = garant;
        this.ligada = false;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getVoltagem() {
        return volts;
    }

    public void setVoltagem(String voltagem) {
        this.volts = voltagem;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getGarantia() {
        return garant;
    }

    public void setGarantia(String garant) {
        this.garant = garant;
    }

    public boolean isLigada() {
        return ligada;
    }

    public void ligar() {
        this.ligada = true;
        System.out.println("*Lâmpada Ligada*");
    }

    public void desligar() {
        this.ligada = false;
        System.out.println("*Lâmpada Desligada*");
    }

    public void mostrarStatus() {
        System.out.println("Início Do Sistema Lâmpada");
        System.out.println("Cor:      " + cor);
        System.out.println("Marca:    " + marca);
        System.out.println("Modelo:   " + modelo);
        System.out.println("Watts:    " + volts);
        System.out.println("Tipo:     " + tipo);
        System.out.println("Garantia: " + garant);
        System.out.println("Preço R$: " + preco);
        System.out.println("Status:   " + (ligada ? "Ligada" : "Desligada"));
    }
    public void mudarStatus() {
        if (ligada) {
            desligar();
        } else {
            ligar();
        }
    }

    public static void main(String[] args) {
        Lamp lampada = new Lamp("Philips", "10 volts", "Funciona", "Philips Master LEDbulb", "Branco", 10.0, "2 anos");

        lampada.mostrarStatus();

        java.util.Scanner sc = new java.util.Scanner(System.in);
        
        int opcao;
        do {
            System.out.print("Ligar/Desligar lâmpada? \n");
            System.out.print("0–Sair / 1–Sim / 2–Não:"); 
            opcao = sc.nextInt();

            if (opcao == 1) {
                lampada.mudarStatus();
            } else if (opcao != 0) {
                System.out.println("Opção inválida!");
            }
        } while (opcao != 0);

        System.out.println("*** Você encerrou o sistema. ***");
        sc.close();
    }
}
