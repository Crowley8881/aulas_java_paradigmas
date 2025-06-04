
public class Quadrado {
    // Atributo privado
    private double lado;

    public Quadrado() {
        this.lado = 1;
        System.out.println("Quadrado criado com lado = 1");
    }


    public Quadrado(double lado) {
        this.lado = lado;
        System.out.println("Quadrado criado com lado = " + lado);
    }

    public Quadrado(double valor, int opcao) {
        switch (opcao) {
            case 1: 
                this.lado = valor / 4;
                System.out.println("Quadrado criado a partir do perímetro = " + valor);
                break;
            case 2: 
                this.lado = Math.sqrt(valor);
                System.out.println("Quadrado criado a partir da área = " + valor);
                break;
            case 3: 
                this.lado = valor / Math.sqrt(2);
                System.out.println("Quadrado criado a partir da diagonal = " + valor);
                break;
            default:
                this.lado = 0;
                System.out.println("Opção inválida! Quadrado criado com lado = 0");
        }
    }


    @Override
    protected void finalize() throws Throwable {
        System.out.println("Objeto Quadrado destruído!");
        super.finalize();
    }


    public boolean isValido() {
        return lado > 0;
    }


    public double Perimetro() {
        return 4 * lado;
    }


    public double Area() {
        return lado * lado;
    }


    public double Diagonal() {
        return lado * Math.sqrt(2);
    }

    public double getLado() {
        return lado;
    }
}
