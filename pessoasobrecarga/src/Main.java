public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        Pessoa pessoa2 = new Pessoa("Maria");

        PessoaFisica pf1 = new PessoaFisica();
        PessoaFisica pf2 = new PessoaFisica("João", "MG123456");
        PessoaFisica pf3 = new PessoaFisica("Ana", "SP7891011", "123.456.789-00");

        PessoaJuridica pj1 = new PessoaJuridica();
        PessoaJuridica pj2 = new PessoaJuridica("Empresa XYZ", "123456789");
        PessoaJuridica pj3 = new PessoaJuridica("Empresa ABC", "987654321", "12.345.678/0001-00");

        System.out.println("=== Pessoa ===");
        pessoa2.imprimirDados();

        System.out.println("\n=== Pessoa Física 2 ===");
        pf2.imprimirDados();

        System.out.println("\n=== Pessoa Física 3 ===");
        pf3.imprimirDados();

        System.out.println("\n=== Pessoa Jurídica 2 ===");
        pj2.imprimirDados();

        System.out.println("\n=== Pessoa Jurídica 3 ===");
        pj3.imprimirDados();
    }
}
