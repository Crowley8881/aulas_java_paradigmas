
public class Cubo extends Figura {


    public Cubo() {
        super();
    }


    public Cubo(double lado) {
        super(lado, lado, lado);
    }


    @Override
    public double volume() {
        return dim1 * dim1 * dim1;
    }


    @Override
    public double area() {
        return 6 * dim1 * dim1;
    }


    @Override
    public void aumentar(double percentual) {
        double fator = 1 + (percentual / 100);
        dim1 *= fator;
        dim2 *= fator;
        dim3 *= fator;
    }

    @Override
    public String toString() {
        return "Cubo [lado=" + dim1 + "]";
    }
}
