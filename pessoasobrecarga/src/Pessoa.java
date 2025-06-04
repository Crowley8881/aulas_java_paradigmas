public class Pessoa {
    protected String nome, logradouro, bairro, cidade, estado, cep, telefone, email;

    public Pessoa() {
    }

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public Pessoa(String nome, String logradouro, String bairro, String cidade, String estado,
                  String cep, String telefone, String email) {
        this.nome = nome;
        this.logradouro = logradouro;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
        this.telefone = telefone;
        this.email = email;
    }

    public void imprimirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Logradouro: " + logradouro);
        System.out.println("Bairro: " + bairro);
        System.out.println("Cidade: " + cidade);
        System.out.println("Estado: " + estado);
        System.out.println("CEP: " + cep);
        System.out.println("Telefone: " + telefone);
        System.out.println("Email: " + email);
    }
}
