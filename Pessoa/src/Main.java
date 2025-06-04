public class Main {
    public static void main(String[] args) {
        PessoaFisica pf = new PessoaFisica("João", "Rua A", "Centro", "CidadeX", "EstadoY",
                "12345-678", "99999-9999", "joao@email.com", "1234567", "111.222.333-44");

        PessoaJuridica pj = new PessoaJuridica("Empresa XYZ", "Av. B", "Comercial", "CidadeZ", "EstadoW",
                "87654-321", "88888-8888", "contato@xyz.com", "987654321", "12.345.678/0001-90");

        System.out.println("--- Pessoa Física ---");
        pf.imprimirDados();

        System.out.println("\n--- Pessoa Jurídica ---");
        pj.imprimirDados();
    }
}
