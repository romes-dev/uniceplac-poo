class Pedido {
    private double valor;
    private String status;

    public Pedido(double valor) {
        this.valor = valor;
        this.status = "Pendente";
    }

    public void confirmarPagamento() {
        this.status = "Pago";
    }

    public void exibirPedido() {
        System.out.println("Pedido de $" + valor + " | Status: " + status);
    }
}

class Cliente {
    private String nome;

    public Cliente(String nome) {
        this.nome = nome;
    }

    public void fazerPedido(Pedido pedido) {
        System.out.println(nome + " fez um novo pedido.");
        pedido.exibirPedido();
    }
}

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Ana");
        Pedido pedido1 = new Pedido(150.0);
        
        cliente.fazerPedido(pedido1);
        
        pedido1.confirmarPagamento();
        pedido1.exibirPedido();
    }
}
