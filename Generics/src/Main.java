// Arquivo: Main.java

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {


        List<Aluno> aluno = new ArrayList<Aluno>();
        List<Professor> prof = new ArrayList<Professor>();
        List<FunAdm> funAdm = new ArrayList<FunAdm>();

        Endereco enderecoComum = new Endereco("Rua Genérica, 100", "Cidade Exemplo", "00000-000");

        System.out.println("Inserindo alunos...");
        for (int i = 1; i <= 10; i++) {
            Aluno novoAluno = new Aluno(
                    "Aluno " + i,
                    100 + i,
                    enderecoComum,
                    "111.111.111-" + String.format("%02d", i),
                    "Curso Genérico " + (i % 3 + 1)
            );
            aluno.add(novoAluno);
        }

        System.out.println("\nInserindo professores...");
        for (int i = 1; i <= 5; i++) {
            Professor novoProfessor = new Professor(
                    "Professor " + i,
                    200 + i,
                    enderecoComum,
                    "222.222.222-" + String.format("%02d", i),
                    "Doutorado em Área " + i
            );
            prof.add(novoProfessor);
        }

        System.out.println("\nInserindo funcionários administrativos...");
        for (int i = 1; i <= 5; i++) {
            FunAdm novoFunAdm = new FunAdm(
                    "Funcionário Adm " + i,
                    300 + i,
                    enderecoComum,
                    "333.333.333-" + String.format("%02d", i),
                    "Cargo Adm " + i
            );
            funAdm.add(novoFunAdm);
        }


        System.out.println("\n--- Contagem Final ---");
        System.out.println("Número de alunos inseridos: " + aluno.size());
        System.out.println("Número de professores inseridos: " + prof.size());
        System.out.println("Número de funcionários administrativos inseridos: " + funAdm.size());




    }
}