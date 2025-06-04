public class PessoaFisica extends Pessoa {
    private String rg, cpf;

    public PessoaFisica() {
    }

    public PessoaFisica(String nome, String rg) {
        super(nome);
        this.rg = rg;
    }

    public PessoaFisica(String nome, String rg, String cpf) {
        super(nome);
        this.rg = rg;
        this.cpf = cpf;
    }

    public PessoaFisica(String nome, String logradouro, String bairro, String cidade, String estado,
                        String cep, String telefone, String email, String rg, String cpf) {
        super(nome, logradouro, bairro, cidade, estado, cep, telefone, email);
        this.rg = rg;
        this.cpf = cpf;
    }

    @Override
    public void imprimirDados() {
        super.imprimirDados();
        System.out.println("RG: " + rg);
        System.out.println("CPF: " + cpf);
    }
}
