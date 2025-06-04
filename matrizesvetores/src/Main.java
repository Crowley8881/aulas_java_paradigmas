import java.util.Arrays;

public class Main {

    public static char[] reverso(char[] s) {
        if (s == null) {
            return null;
        }
        int n = s.length;
        char[] resultado = new char[n];
        for (int i = 0; i < n; i++) {
            resultado[i] = s[n - 1 - i];
        }
        return resultado;
    }

    public static boolean anagrama(char[] s1, char[] s2) {
        if (s1 == null || s2 == null || s1.length != s2.length) {
            return false;
        }
        if (s1.length == 0 && s2.length == 0) { // Duas strings vazias são anagramas
            return true;
        }
        char[] copiaS1 = Arrays.copyOf(s1, s1.length);
        char[] copiaS2 = Arrays.copyOf(s2, s2.length);

        Arrays.sort(copiaS1);
        Arrays.sort(copiaS2);

        return Arrays.equals(copiaS1, copiaS2);
    }

    
    public static void copiaStrs(char[] origem, char[] destino) {
        if (origem == null || destino == null) {
            return; // Ou lançar exceção
        }
        int tamanhoCopia = Math.min(origem.length, destino.length);
        for (int i = 0; i < tamanhoCopia; i++) {
            destino[i] = origem[i];
        }
        
    }

    public static char[] concatenar(char[] s1, char[] s2) {
        if (s1 == null && s2 == null) return null;
        if (s1 == null) return Arrays.copyOf(s2, s2.length);
        if (s2 == null) return Arrays.copyOf(s1, s1.length);

        char[] resultado = new char[s1.length + s2.length];
        System.arraycopy(s1, 0, resultado, 0, s1.length);
        System.arraycopy(s2, 0, resultado, s1.length, s2.length);
        return resultado;
    }

    public static boolean palindromo(char[] s) {
        if (s == null) {
            return false; 
        }
        int n = s.length;
        if (n == 0) {
            return true; 
        }
        for (int i = 0; i < n / 2; i++) {
            if (s[i] != s[n - 1 - i]) {
                return false;
            }
        }
        return true;
    }

    public static int[][] matrizTransposta(int[][] m) {
        if (m == null || m.length == 0 || m[0].length == 0) {
            return null; 
        }
        int linhas = m.length;
        int colunas = m[0].length;
        int[][] transposta = new int[colunas][linhas];

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                transposta[j][i] = m[i][j];
            }
        }
        return transposta;
    }

    public static boolean matrizIdentidade(int[][] m) {
        if (m == null || m.length == 0) {
            return false; 
        }
        int linhas = m.length;
        if (m[0] == null || linhas != m[0].length) {
            if (linhas > 0 && m[0] == null && linhas > 0) return false; 
            if (linhas > 0 && linhas != m[0].length) return false; 
        }

        int colunas = m[0].length;
        if (linhas != colunas) return false; 

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                if (i == j) { 
                    if (m[i][j] != 1) {
                        return false;
                    }
                } else { 
                    if (m[i][j] != 0) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    // 8. Dada uma matriz quadrada, retorne a soma dos elementos de ambas as diagonais
    public static int somaDiagonais(int[][] m) {
        if (m == null || m.length == 0 || m.length != m[0].length) {
           
            System.err.println("A matriz não é quadrada ou é inválida.");
            return 0;
        }
        int n = m.length;
        int soma = 0;

        for (int i = 0; i < n; i++) {
            soma += m[i][i];
        }

        for (int i = 0; i < n; i++) {
            soma += m[i][n - 1 - i];
        }

        if (n % 2 != 0) {
           ;
        }
        return soma;
    }

    public static int[][] somaMatrizes(int[][] m1, int[][] m2) {
        if (m1 == null || m2 == null || m1.length == 0 || m1.length != m2.length || m1[0].length != m2[0].length) {
            System.err.println("Matrizes incompatíveis para soma ou inválidas.");
            return null; // Ou lançar exceção
        }
        int linhas = m1.length;
        int colunas = m1[0].length;
        int[][] resultado = new int[linhas][colunas];

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                resultado[i][j] = m1[i][j] + m2[i][j];
            }
        }
        return resultado;
    }

    // 10. Dadas duas matrizes, faça a multiplicação de matrizes
    public static int[][] multiplicaMatrizes(int[][] m1, int[][] m2) {
        if (m1 == null || m2 == null || m1.length == 0 || m2.length == 0 || m1[0].length != m2.length) {
            System.err.println("Matrizes incompatíveis para multiplicação ou inválidas.");
            return null; 
        }

        int linhasM1 = m1.length;
        int colunasM1 = m1[0].length; 
        int colunasM2 = m2[0].length;

        int[][] resultado = new int[linhasM1][colunasM2];

        for (int i = 0; i < linhasM1; i++) {
            for (int j = 0; j < colunasM2; j++) {
                for (int k = 0; k < colunasM1; k++) { 
                    resultado[i][j] += m1[i][k] * m2[k][j];
                }
            }
        }
        return resultado;
    }

    public static void printCharArray(char[] arr) {
        if (arr == null) {
            System.out.println("null");
            return;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void printMatrix(int[][] matrix) {
        if (matrix == null) {
            System.out.println("null matrix");
            return;
        }
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }

    public static void main(String[] args) {
        System.out.println("--- Testes VetoresMatrizes ---");

        // 1. Reverso
        System.out.println("\n1. Reverso:");
        char[] str1 = {'a', 'b', 'c', 'd', 'e'};
        printCharArray(reverso(str1)); // Saída: [e, d, c, b, a]

        // 2. Anagrama
        System.out.println("\n2. Anagrama:");
        char[] ana1 = {'a', 'm', 'o', 'r'};
        char[] ana2 = {'r', 'o', 'm', 'a'};
        char[] ana3 = {'c', 'a', 's', 'a'};
        System.out.println(Arrays.toString(ana1) + " e " + Arrays.toString(ana2) + " são anagramas? " + anagrama(ana1, ana2)); // true
        System.out.println(Arrays.toString(ana1) + " e " + Arrays.toString(ana3) + " são anagramas? " + anagrama(ana1, ana3)); // false

        // 3. CopiaStrs
        System.out.println("\n3. CopiaStrs:");
        char[] original = {'t', 'e', 's', 't', 'e'};
        char[] destino = new char[original.length + 2]; // Destino maior
        copiaStrs(original, destino);
        System.out.print("Original: "); printCharArray(original);
        System.out.print("Destino após cópia: "); printCharArray(destino); // [t,e,s,t,e,\0,\0] (char 0)

        char[] destinoCurto = new char[3];
        copiaStrs(original, destinoCurto);
        System.out.print("Destino curto após cópia: "); printCharArray(destinoCurto); // [t,e,s]


        // 4. Concatenar
        System.out.println("\n4. Concatenar:");
        char[] concat1 = {'o', 'l', 'a', ' '};
        char[] concat2 = {'m', 'u', 'n', 'd', 'o'};
        printCharArray(concatenar(concat1, concat2)); // [o, l, a,  , m, u, n, d, o]

        // 5. Palindromo
        System.out.println("\n5. Palindromo:");
        char[] pal1 = {'a', 'r', 'a', 'r', 'a'};
        char[] pal2 = {'c', 'a', 's', 'a'};
        System.out.println(Arrays.toString(pal1) + " é palíndromo? " + palindromo(pal1)); // true
        System.out.println(Arrays.toString(pal2) + " é palíndromo? " + palindromo(pal2)); // false

        // 6. MatrizTransposta
        System.out.println("\n6. MatrizTransposta:");
        int[][] matrizA = {{1, 2, 3}, {4, 5, 6}};
        System.out.println("Original A:"); printMatrix(matrizA);
        System.out.println("Transposta A:"); printMatrix(matrizTransposta(matrizA));
        

        // 7. MatrizIdentidade
        System.out.println("\n7. MatrizIdentidade:");
        int[][] id = {{1, 0, 0}, {0, 1, 0}, {0, 0, 1}};
        int[][] notId = {{1, 0, 0}, {0, 5, 0}, {0, 0, 1}};
        int[][] notId2 = {{1, 0}, {0, 1}, {0,0}}; //Não quadrada
        System.out.println("É identidade? "); printMatrix(id); System.out.println(matrizIdentidade(id)); 
        System.out.println("É identidade? "); printMatrix(notId); System.out.println(matrizIdentidade(notId)); 
        System.out.println("É identidade? "); printMatrix(notId2); System.out.println(matrizIdentidade(notId2)); 


        // 8. SomaDiagonais
        System.out.println("\n8. SomaDiagonais:");
        int[][] diagMat = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}; 
        System.out.println("Matriz para soma das diagonais:"); printMatrix(diagMat);
        System.out.println("Soma das diagonais: " + somaDiagonais(diagMat)); 

        int[][] diagMat2 = {{1,2},{3,4}};
        System.out.println("Matriz para soma das diagonais:"); printMatrix(diagMat2);
        System.out.println("Soma das diagonais: " + somaDiagonais(diagMat2)); 

        // 
        System.out.println("\n9. SomaMatrizes:");
        int[][] somaM1 = {{1, 2}, {3, 4}};
        int[][] somaM2 = {{5, 6}, {7, 8}};
        System.out.println("M1:"); printMatrix(somaM1);
        System.out.println("M2:"); printMatrix(somaM2);
        System.out.println("M1 + M2:"); printMatrix(somaMatrizes(somaM1, somaM2));
    
        
        System.out.println("\n10. MultiplicaMatrizes:");
        int[][] multM1 = {{1, 2, 3}, {4, 5, 6}}; 
        int[][] multM2 = {{7, 8}, {9, 10}, {11, 12}}; 
       
        System.out.println("M1 (2x3):"); printMatrix(multM1);
        System.out.println("M2 (3x2):"); printMatrix(multM2);
        System.out.println("M1 * M2:"); printMatrix(multiplicaMatrizes(multM1, multM2));
        

        int[][] multM3 = {{1,2},{3,4}}; 
        int[][] multM4 = {{1,0},{0,1}}; 
        System.out.println("M3 (2x2):"); printMatrix(multM3);
        System.out.println("M4 (2x2):"); printMatrix(multM4);
        System.out.println("M3 * M4:"); printMatrix(multiplicaMatrizes(multM3, multM4)); 

    }
}