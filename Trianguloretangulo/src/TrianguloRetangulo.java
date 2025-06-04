public class TrianguloRetangulo extends Triangulo {

    TrianguloRetangulo() {
        // Construtor padrão
    }

    TrianguloRetangulo(double lado1, double lado2, double lado3) {
        super(lado1, lado2, lado3); // Usa construtor da classe Triangulo
    }

    boolean trianguloValido2() {
        double hip = Math.pow(this.getLado3(), 2);
        double cat = Math.pow(this.getLado1(), 2) + Math.pow(this.getLado2(), 2);
        return toleranciaOK(hip, cat);
    }

    double area2() {
        return (this.getLado1() * this.getLado2()) / 2;
    }

    double hipotenusa() {
        double lado1Quad = Math.pow(this.getLado1(), 2);
        double lado2Quad = Math.pow(this.getLado2(), 2);
        double hipot = Math.sqrt(lado1Quad + lado2Quad);
        return (float) hipot;
    }

    double cateto(double hipot) {
        return hipot / Math.sqrt(2);
    }

    boolean toleranciaOK(double v1, double v2) {
        return (v1 >= v2 * 0.999) && (v1 <= v2 * 1.001);
    }
}
