
public class Main {

    public static void main(String[] args) {
        System.out.println("===== SISTEMA DE CONTAS BANCÁRIAS =====\n");

        ContaBancaria conta1 = new ContaBancaria();
        conta1.setNomeCliente("João Silva");
        conta1.setNumeroConta(12345);
        conta1.setTipoConta('C');
        conta1.setSaldo(1500.50);

        ContaBancaria conta2 = new ContaBancaria("Maria Oliveira", 67890, 'P', 3000.75);

        System.out.println("Informações da Conta 1:");
        System.out.println(conta1.toString());

        System.out.println("\nInformações da Conta 2:");
        System.out.println(conta2.toString());

        System.out.println("\n===== REALIZANDO OPERAÇÕES =====");

        double novoSaldo = conta1.getSaldo() + 500.0;
        conta1.setSaldo(novoSaldo);
        System.out.println("\nDepósito de R$ 500,00 na conta de " + conta1.getNomeCliente());
        System.out.println("Novo saldo: R$ " + String.format("%.2f", conta1.getSaldo()));

        conta2.setTipoConta('C');
        System.out.println("\nAlterando o tipo da conta de " + conta2.getNomeCliente() + " para Corrente");
        System.out.println("Novo tipo: " + (conta2.getTipoConta() == 'P' ? "Poupança" : "Corrente"));

        System.out.println("\n===== INFORMAÇÕES ATUALIZADAS =====");
        System.out.println("\nConta 1:");
        System.out.println(conta1.toString());

        System.out.println("\nConta 2:");
        System.out.println(conta2.toString());
    }
}
