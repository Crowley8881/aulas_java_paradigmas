public class Main {
    public static void main(String[] args) {
        Endereco endComum = new Endereco("Rua Exemplo, 123", "Cidade Exemplo", "30000-000");

        Aluno aluno1 = new Aluno("Carlos Silva", 101, endComum, "111.222.333-44", "Engenharia de Software");
        Professor prof1 = new Professor("Ana Souza", 201, endComum, "555.666.777-88", "Doutorado em IA");
        FunAdm adm1 = new FunAdm("Roberto Lima", 301, endComum, "888.999.000-11", "Secretário Acadêmico");

        System.out.println("--- Informações ---");
        System.out.println("Aluno: " + aluno1.getNome() + ", Curso: " + aluno1.getCurso());
        System.out.println("Professor: " + prof1.getNome() + ", Titulação: " + prof1.getTitulacao());
        System.out.println("Adm: " + adm1.getNome() + ", Função: " + adm1.getFuncao());

        System.out.println("\n--- Testes de Autenticação ---");
        System.out.println("Aluno autentica com 'Aluno'? " + aluno1.autenticar("Aluno")); // true
        System.out.println("Aluno autentica com 'Professor'? " + aluno1.autenticar("Professor")); // false

        System.out.println("Professor autentica com 'Professor'? " + prof1.autenticar("Professor")); // true
        System.out.println("Adm autentica com 'FunAdm'? " + adm1.autenticar("FunAdm")); // true

        IAutenticacao pessoaAutenticavel = aluno1;
        System.out.println("\nAutenticando aluno1 como IAutenticacao com 'Aluno': " + pessoaAutenticavel.autenticar("Aluno"));

        pessoaAutenticavel = prof1;
        System.out.println("Autenticando prof1 como IAutenticacao com 'Professor': " + pessoaAutenticavel.autenticar("Professor"));
    }
}