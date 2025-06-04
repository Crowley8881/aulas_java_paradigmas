import java.util.Scanner;

public class  perimetro{

    public static void main(String[] args) {
        final double PI = 3.14159;
        int raio;
        double perim, area;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Entre com o valor do raio: ");
        raio = scanner.nextInt();
        scanner.close();

        perim = 2 * PI * raio;
        area = PI * Math.pow(raio, 2);

        System.out.println("O perímetro da circunferência de raio " + raio + " é " + perim);
        System.out.println("A área é " + area);
    }
}