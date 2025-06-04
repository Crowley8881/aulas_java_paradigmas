
public class Paralelepipedo extends Figura {

    public Paralelepipedo() {
        super();
    }


    public Paralelepipedo(double comprimento, double largura, double altura) {
        super(comprimento, largura, altura);
    }


    @Override
    public double volume() {
        return dim1 * dim2 * dim3;
    }


    @Override
    public double area() {
        return 2 * (dim1 * dim2 + dim1 * dim3 + dim2 * dim3);
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
        return "Paralelepipedo [comprimento=" + dim1 + ", largura=" + dim2 + ", altura=" + dim3 + "]";
    }
}
