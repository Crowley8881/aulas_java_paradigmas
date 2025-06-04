import java.util.Scanner;
import javax.swing.JOptionPane;


public class Main {

    private static Quadrado quadrado;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao = 0;
        boolean usarGUI = false;

        String resposta = JOptionPane.showInputDialog(null,
                "Deseja usar interface gráfica? (S/N)",
                "Escolha da Interface",
                JOptionPane.QUESTION_MESSAGE);

        if (resposta != null && resposta.toUpperCase().startsWith("S")) {
            usarGUI = true;
        }

        do {
            if (usarGUI) {
                opcao = menuGUI();
            } else {
                opcao = menuConsole();
            }

            processarOpcao(opcao, usarGUI);

        } while (opcao != 9);

        scanner.close();
    }


    private static int menuConsole() {
        System.out.println("\n===== MENU QUADRADO =====");
        System.out.println("1 - Criar um quadrado padrão de lado = 1");
        System.out.println("2 - Criar um quadrado que recebe o valor do atributo lado");
        System.out.println("3 - Criar um quadrado dado o valor do perímetro");
        System.out.println("4 - Criar um quadrado dado o valor da área");
        System.out.println("5 - Criar um quadrado dado o valor da diagonal");
        System.out.println("6 - Imprimir o valor dos atributos: getLado(), Perimetro(), Area() e Diagonal()");
        System.out.println("9 - Encerrar o programa");
        System.out.print("Escolha uma opção: ");

        try {
            return scanner.nextInt();
        } catch (Exception e) {
            scanner.nextLine(); 
            return 0; 
        }
    }


    private static int menuGUI() {
        String[] opcoes = {
                "1 - Criar um quadrado padrão de lado = 1",
                "2 - Criar um quadrado que recebe o valor do atributo lado",
                "3 - Criar um quadrado dado o valor do perímetro",
                "4 - Criar um quadrado dado o valor da área",
                "5 - Criar um quadrado dado o valor da diagonal",
                "6 - Imprimir o valor dos atributos",
                "9 - Encerrar o programa"
        };

        String escolha = (String) JOptionPane.showInputDialog(
                null,
                "Escolha uma opção:",
                "Menu Quadrado",
                JOptionPane.PLAIN_MESSAGE,
                null,
                opcoes,
                opcoes[0]);

        if (escolha == null) {
            return 9; // 
        }

        return Integer.parseInt(escolha.substring(0, 1));
    }


    private static void processarOpcao(int opcao, boolean usarGUI) {
        double valor;

        switch (opcao) {
            case 1: 
                quadrado = new Quadrado();
                break;

            case 2: 
                if (usarGUI) {
                    try {
                        String input = JOptionPane.showInputDialog("Digite o valor do lado:");
                        valor = Double.parseDouble(input);
                        quadrado = new Quadrado(valor);
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "Valor inválido!");
                    }
                } else {
                    System.out.print("Digite o valor do lado: ");
                    valor = scanner.nextDouble();
                    quadrado = new Quadrado(valor);
                }
                break;

            case 3: 
                if (usarGUI) {
                    try {
                        String input = JOptionPane.showInputDialog("Digite o valor do perímetro:");
                        valor = Double.parseDouble(input);
                        quadrado = new Quadrado(valor, 1);
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "Valor inválido!");
                    }
                } else {
                    System.out.print("Digite o valor do perímetro: ");
                    valor = scanner.nextDouble();
                    quadrado = new Quadrado(valor, 1);
                }
                break;

            case 4: 
                if (usarGUI) {
                    try {
                        String input = JOptionPane.showInputDialog("Digite o valor da área:");
                        valor = Double.parseDouble(input);
                        quadrado = new Quadrado(valor, 2);
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "Valor inválido!");
                    }
                } else {
                    System.out.print("Digite o valor da área: ");
                    valor = scanner.nextDouble();
                    quadrado = new Quadrado(valor, 2);
                }
                break;

            case 5: 
                if (usarGUI) {
                    try {
                        String input = JOptionPane.showInputDialog("Digite o valor da diagonal:");
                        valor = Double.parseDouble(input);
                        quadrado = new Quadrado(valor, 3);
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "Valor inválido!");
                    }
                } else {
                    System.out.print("Digite o valor da diagonal: ");
                    valor = scanner.nextDouble();
                    quadrado = new Quadrado(valor, 3);
                }
                break;

            case 6: 
                if (quadrado == null) {
                    if (usarGUI) {
                        JOptionPane.showMessageDialog(null, "ERRO: Nenhum quadrado foi criado!");
                    } else {
                        System.out.println("ERRO: Nenhum quadrado foi criado!");
                    }
                } else {
                    String resultado = "Lado = " + quadrado.getLado() + "\n" +
                            "Perímetro = " + quadrado.Perimetro() + "\n" +
                            "Área = " + quadrado.Area() + "\n" +
                            "Diagonal = " + quadrado.Diagonal();

                    if (usarGUI) {
                        JOptionPane.showMessageDialog(null, resultado, "Dados do Quadrado", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        System.out.println("\n=== DADOS DO QUADRADO ===");
                        System.out.println(resultado);
                    }
                }
                break;

            case 9: 
                if (usarGUI) {
                    JOptionPane.showMessageDialog(null, "Programa encerrado!");
                } else {
                    System.out.println("Programa encerrado!");
                }
                break;

            default:
                if (usarGUI) {
                    JOptionPane.showMessageDialog(null, "Opção inválida!");
                } else {
                    System.out.println("Opção inválida!");
                }
        }

        if (opcao >= 1 && opcao <= 5) {
            System.gc();
        }
    }
}