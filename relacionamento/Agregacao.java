import java.util.ArrayList;
import java.util.List;

class Departamento {
    private String nome;
    private List<Funcionario> funcionarios; // Agregação
    
    public Departamento(String nome) {
        this.nome = nome;
        this.funcionarios = new ArrayList<>();
    }
    
    public void adicionarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }
    
    public void listarFuncionarios() {
        System.out.println("Departamento: " + nome);
        for (Funcionario f : funcionarios) {
            System.out.println("- " + f.getNome());
        }
    }
}

class Funcionario {
    private String nome;
    
    public Funcionario(String nome) {
        this.nome = nome;
    }
    
    public String getNome() {
        return nome;
    }
}

public class Main {
    public static void main(String[] args) {
        Departamento deptoTI = new Departamento("TI");
        Funcionario joao = new Funcionario("João");
        Funcionario maria = new Funcionario("Maria");

        deptoTI.adicionarFuncionario(joao);
        deptoTI.adicionarFuncionario(maria);

        deptoTI.listarFuncionarios();
    }
}
