
public abstract class Figura {
    
    protected double dim1;
    protected double dim2;
    protected double dim3;

    public Figura() {
        this.dim1 = 0;
        this.dim2 = 0;
        this.dim3 = 0;
    }


    public Figura(double dim1, double dim2, double dim3) {
        this.dim1 = dim1;
        this.dim2 = dim2;
        this.dim3 = dim3;
    }


    public abstract double volume();


    public abstract double area();

    public abstract void aumentar(double percentual);


    public void meusDados() {
        System.out.println("Dimensões: " + dim1 + " x " + dim2 + " x " + dim3);
        System.out.println("Área: " + area());
        System.out.println("Volume: " + volume());
    }
}
