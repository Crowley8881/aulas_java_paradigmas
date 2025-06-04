// Pessoa.java
public class Pessoa {
    String nome;
    int id;
    Endereco end;
    String CPF;
    String titulacao;
    String curso;
    String funcao;

    public Pessoa() {
    }

    public Pessoa(String nome, int id, Endereco end, String CPF) {
        this.nome = nome;
        this.id = id;
        this.end = end;
        this.CPF = CPF;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Endereco getEnd() {
        return end;
    }

    public void setEnd(Endereco end) {
        this.end = end;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }
}