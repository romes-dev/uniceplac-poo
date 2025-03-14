interface Pagamento {
    void processar();
}

class Boleto implements Pagamento {
    @Override
    public void processar() {
        System.out.println("Processando pagamento via Boleto.");
    }
}

class Pix implements Pagamento {
    @Override
    public void processar() {
        System.out.println("Processando pagamento via Pix.");
    }
}

public class Main {
    public static void main(String[] args) {
        Pagamento p1 = new Boleto();
        Pagamento p2 = new Pix();

        p1.processar();
        p2.processar();
    }
}
