public class Professor extends Pessoa implements IAutenticacao {

    public Professor(String nome, int id, Endereco end, String CPF, String titulacao) {
        this.nome = nome;
        this.id = id;
        this.end = end;
        this.CPF = CPF;
        this.titulacao = titulacao;
    }

    @Override
    public boolean autenticar(String id) {
        return "Professor".equals(id);
    }

    public String getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }
}