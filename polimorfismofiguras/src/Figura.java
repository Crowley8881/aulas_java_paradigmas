public abstract class Figura {
    String nome;
    double dim1, dim2, dim3;

    public Figura(String nome, double dim1, double dim2, double dim3) {
        this.nome = nome;
        this.dim1 = dim1;
        this.dim2 = dim2;
        this.dim3 = dim3;
    }

    abstract double volume();
    abstract double area();

    public void display() {
        System.out.println("Nome: " + nome);
        System.out.println("Dim1: " + dim1);
        System.out.println("Dim2: " + dim2);
        System.out.println("Dim3: " + dim3);
        System.out.println("Volume: " + volume());
        System.out.println("Área: " + area());
        System.out.println("-------------------------");
    }
}
