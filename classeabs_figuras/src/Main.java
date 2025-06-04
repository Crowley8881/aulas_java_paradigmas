public class Main {

    public static void main(String[] args) {
        System.out.println("===== TESTE DE FIGURAS GEOMÉTRICAS =====\n");

        
        Cubo cubo = new Cubo(5);
        Esfera esfera = new Esfera(3);
        Paralelepipedo paralelepipedo = new Paralelepipedo(4, 6, 8);


        System.out.println("===== DADOS INICIAIS =====");

        System.out.println("\n----- CUBO -----");
        System.out.println(cubo);
        cubo.meusDados();

        System.out.println("\n----- ESFERA -----");
        System.out.println(esfera);
        esfera.meusDados();

        System.out.println("\n----- PARALELEPÍPEDO -----");
        System.out.println(paralelepipedo);
        paralelepipedo.meusDados();

        double percentualAumento = 20;
        System.out.println("\n===== AUMENTANDO DIMENSÕES EM " + percentualAumento + "% =====");

        cubo.aumentar(percentualAumento);
        esfera.aumentar(percentualAumento);
        paralelepipedo.aumentar(percentualAumento);

        System.out.println("\n===== DADOS APÓS AUMENTO =====");

        System.out.println("\n----- CUBO -----");
        System.out.println(cubo);
        cubo.meusDados();

        System.out.println("\n----- ESFERA -----");
        System.out.println(esfera);
        esfera.meusDados();

        System.out.println("\n----- PARALELEPÍPEDO -----");
        System.out.println(paralelepipedo);
        paralelepipedo.meusDados();

        System.out.println("\n===== DEMONSTRAÇÃO DE POLIMORFISMO =====");

        Figura[] figuras = new Figura[3];
        figuras[0] = cubo;
        figuras[1] = esfera;
        figuras[2] = paralelepipedo;

        for (int i = 0; i < figuras.length; i++) {
            System.out.println("\nFigura " + (i + 1) + ":");
            figuras[i].meusDados();
        }
    }
}
