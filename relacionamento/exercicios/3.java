class Motor {
    private String tipo;

    public Motor(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }
}

class Veiculo {
    private String modelo;
    private Motor motor; // Composição

    public Veiculo(String modelo, String tipoMotor) {
        this.modelo = modelo;
        this.motor = new Motor(tipoMotor); // Criando motor dentro do veículo
    }

    public void detalhes() {
        System.out.println("Veículo: " + modelo + " | Motor: " + motor.getTipo());
    }
}

public class Main {
    public static void main(String[] args) {
        Veiculo carro = new Veiculo("Fusca", "1.6");
        carro.detalhes();
    }
}
