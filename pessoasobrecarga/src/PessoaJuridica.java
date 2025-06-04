public class PessoaJuridica extends Pessoa {
    private String inscricaoEstadual, cnpj;

    public PessoaJuridica() {
    }

    public PessoaJuridica(String nome, String inscricaoEstadual) {
        super(nome);
        this.inscricaoEstadual = inscricaoEstadual;
    }

    public PessoaJuridica(String nome, String inscricaoEstadual, String cnpj) {
        super(nome);
        this.inscricaoEstadual = inscricaoEstadual;
        this.cnpj = cnpj;
    }

    public PessoaJuridica(String nome, String logradouro, String bairro, String cidade, String estado,
                          String cep, String telefone, String email, String inscricaoEstadual, String cnpj) {
        super(nome, logradouro, bairro, cidade, estado, cep, telefone, email);
        this.inscricaoEstadual = inscricaoEstadual;
        this.cnpj = cnpj;
    }

    @Override
    public void imprimirDados() {
        super.imprimirDados();
        System.out.println("Inscrição Estadual: " + inscricaoEstadual);
        System.out.println("CNPJ: " + cnpj);
    }
}
