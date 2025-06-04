
public class Triangulo {
    private double lado1;
    private double lado2;
    private double lado3;


    public Triangulo() {
        this.lado1 = 1.0;
        this.lado2 = 1.0;
        this.lado3 = 1.0;
    }


    public Triangulo(double lado1, double lado2, double lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }


    public double getLado1() {
        return lado1;
    }


    public double getLado2() {
        return lado2;
    }


    public double getLado3() {
        return lado3;
    }


    public double perimetro() {
        return lado1 + lado2 + lado3;
    }


    public double area() {
        // Semiperímetro
        double s = perimetro() / 2;

        // Fórmula de Heron: A = √(s(s-a)(s-b)(s-c))
        return Math.sqrt(s * (s - lado1) * (s - lado2) * (s - lado3));
    }
}
