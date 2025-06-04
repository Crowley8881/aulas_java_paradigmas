import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o valor de x: ");
        int x = sc.nextInt();

        ClasseA[] ptrA = new ClasseA[4];
        ptrA[0] = new ClasseA();
        ptrA[1] = new ClasseA1();
        ptrA[2] = new ClasseA2();
        ptrA[3] = new ClasseA3();

        for (int i = 0; i < ptrA.length; i++) {
            System.out.println(i + ": " + ptrA[i].calculo(x));
        }

        sc.close();
    }
}
