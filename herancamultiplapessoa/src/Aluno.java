public class Aluno extends Pessoa implements IAutenticacao {

    public Aluno(String nome, int id, Endereco end, String CPF, String curso) {
        this.nome = nome;
        this.id = id;
        this.end = end;
        this.CPF = CPF;
        this.curso = curso;
    }

    @Override
    public boolean autenticar(String id) {
        return "Aluno".equals(id);
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}
