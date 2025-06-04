public class PessoaFisica extends Pessoa {
    private String rg, cpf;

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
