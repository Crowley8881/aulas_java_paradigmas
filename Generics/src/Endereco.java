// Endereco.java
public class Endereco {
    String rua;
    String cidade;
    String cep;

    public Endereco(String rua, String cidade, String cep) {
        this.rua = rua;
        this.cidade = cidade;
        this.cep = cep;
    }

    @Override
    public String toString() {
        return "Endereco [rua=" + rua + ", cidade=" + cidade + ", cep=" + cep + "]";
    }
}