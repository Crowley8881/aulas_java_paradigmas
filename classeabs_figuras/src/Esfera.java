
public class Esfera extends Figura {

    public Esfera() {
        super();
    }


    public Esfera(double raio) {
        super(raio, raio, raio);
    }


    @Override
    public double volume() {
        return (4.0/3.0) * Math.PI * dim1 * dim1 * dim1;
    }


    @Override
    public double area() {
        return 4 * Math.PI * dim1 * dim1;
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
        return "Esfera [raio=" + dim1 + "]";
    }
}
