class Empresa {
    private String nome;
    
    public Empresa(String nome) {
        this.nome = nome;
    }
    
    public String getNome() {
        return nome;
    }
}

class Trabalhador {
    private String nome;
    private Empresa empresa; // Associação com a classe Empresa
    
    public Trabalhador(String nome, Empresa empresa) {
        this.nome = nome;
        this.empresa = empresa;
    }
    
    public void mostrarDados() {
        System.out.println(nome + " trabalha na empresa " + empresa.getNome());
    }
}

public class Associacao {
    public static void main(String[] args) {
        Empresa empresa = new Empresa("TechCorp");
        Trabalhador trabalhador = new Trabalhador("João", empresa);
        trabalhador.mostrarDados();
    }
}
