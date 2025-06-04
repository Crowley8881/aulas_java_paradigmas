import java.util.Scanner;

public class Main {

    private static TrianguloRetangulo triRet;

    public static void main(String[] args) {

        // Alternativa 1
        triRet = new TrianguloRetangulo(); // Construtor padrão
        imprimeTriangulo(triRet);
        triRet = null;

        // Alternativa 2
        double[] lados = entraLados();
        triRet = new TrianguloRetangulo(lados[0], lados[1], lados[2]); // Construtor com parâmetros
        imprimeTriangulo(triRet);
        triRet = null;
    }

    static void imprimeTriangulo(TrianguloRetangulo tr) {
        if (tr == null) {
            System.out.println(">>> ERRO: OBJETO NULO!");
            System.exit(0);
        }
        System.out.println("Valido? " + tr.trianguloValido2());
        System.out.println("Lado1 = " + tr.getLado1());
        System.out.println("Lado2 = " + tr.getLado2());
        System.out.println("Lado3 = " + tr.getLado3());
        System.out.println("Perimetro = " + tr.perimetro());
        System.out.println("Hipotenusa = " + tr.hipotenusa());
        System.out.println("Area = " + tr.area2());
    }

    static double[] entraLados() {
        Scanner sc = new Scanner(System.in);
        double[] lados = new double[3];
        System.out.print("Digite Lado1 = ");
        lados[0] = sc.nextDouble();
        System.out.print("Digite Lado2 = ");
        lados[1] = sc.nextDouble();
        System.out.print("Digite Lado3 = ");
        lados[2] = sc.nextDouble();
        sc.close();
        return lados;
    }
}
