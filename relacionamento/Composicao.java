class Motor {
    private String tipo;
    
    public Motor(String tipo) {
        this.tipo = tipo;
    }
    
    public String getTipo() {
        return tipo;
    }
}

class Carro {
    private String modelo;
    private Motor motor; // Composição
    
    public Carro(String modelo, String tipoMotor) {
        this.modelo = modelo;
        this.motor = new Motor(tipoMotor); // O motor pertence ao carro
    }
    
    public void detalhes() {
        System.out.println("Carro: " + modelo + " | Motor: " + motor.getTipo());
    }
}

public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro("Fusca", "1.6");
        carro.detalhes();
    }
}
