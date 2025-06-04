public class Paralelepipedo extends Figura {
    public Paralelepipedo(double base, double altura, double profundidade) {
        super("Paralelepípedo", base, altura, profundidade);
    }

    double volume() {
        return dim1 * dim2 * dim3;
    }

    double area() {
        return 2 * (dim1 * dim2 + dim1 * dim3 + dim2 * dim3);
    }
}
