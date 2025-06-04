public class Cone extends Figura {
    public Cone(double raio, double altura) {
        super("Cone", raio, altura, 0);
    }

    double volume() {
        return (1.0 / 3.0) * Math.PI * Math.pow(dim1, 2) * dim2;
    }

    double area() {
        double geratriz = Math.sqrt(Math.pow(dim1, 2) + Math.pow(dim2, 2));
        return Math.PI * dim1 * (dim1 + geratriz);
    }
}
