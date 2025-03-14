import java.util.ArrayList;
import java.util.List;

class Universidade {
    private String nome;
    private List<Aluno> alunos;

    public Universidade(String nome) {
        this.nome = nome;
        this.alunos = new ArrayList<>();
    }

    public void matricularAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public void listarAlunos() {
        System.out.println("Universidade: " + nome);
        for (Aluno aluno : alunos) {
            System.out.println("- " + aluno.getNome());
        }
    }
}

class Aluno {
    private String nome;

    public Aluno(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}

public class Main {
    public static void main(String[] args) {
        Universidade universidade = new Universidade("USP");
        Aluno aluno1 = new Aluno("Carlos");
        Aluno aluno2 = new Aluno("Fernanda");

        universidade.matricularAluno(aluno1);
        universidade.matricularAluno(aluno2);

        universidade.listarAlunos();
    }
}
