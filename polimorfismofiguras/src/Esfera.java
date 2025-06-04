public class Esfera extends Figura {
    public Esfera(double raio) {
        super("Esfera", raio, 0, 0);
    }

    double volume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(dim1, 3);
    }

    double area() {
        return 4 * Math.PI * Math.pow(dim1, 2);
    }
}
