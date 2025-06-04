import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Figura[] figuras = new Figura[4];

        figuras[0] = new Esfera(3);
        figuras[1] = new Cilindro(2, 5);
        figuras[2] = new Paralelepipedo(2, 3, 4);
        figuras[3] = new Cone(2, 5);

        for (Figura f : figuras) {
            f.display();
        }

        sc.close();
    }
}
