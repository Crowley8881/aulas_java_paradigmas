// FunAdm.java
public class FunAdm extends Pessoa implements IAutenticacao {

    public FunAdm(String nome, int id, Endereco end, String CPF, String funcao) {
        this.nome = nome;
        this.id = id;
        this.end = end;
        this.CPF = CPF;
        this.funcao = funcao;
    }

    @Override
    public boolean autenticar(String id) {
        return "FunAdm".equals(id);
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }
}