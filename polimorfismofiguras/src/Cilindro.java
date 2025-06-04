public class Cilindro extends Figura {
    public Cilindro(double raio, double altura) {
        super("Cilindro", raio, altura, 0);
    }

    double volume() {
        return Math.PI * Math.pow(dim1, 2) * dim2;
    }

    double area() {
        return 2 * Math.PI * dim1 * (dim1 + dim2);
    }
}
