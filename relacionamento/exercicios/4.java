class Pagamento {
    public void processarPagamento() {
        System.out.println("Processando pagamento...");
    }
}

class Cartao extends Pagamento {
    @Override
    public void processarPagamento() {
        System.out.println("Pagamento via Cartão.");
    }
}

class Boleto extends Pagamento {
    @Override
    public void processarPagamento() {
        System.out.println("Pagamento via Boleto.");
    }
}

class Pix extends Pagamento {
    @Override
    public void processarPagamento() {
        System.out.println("Pagamento via Pix.");
    }
}

public class Main {
    public static void main(String[] args) {
        Pagamento p1 = new Cartao();
        Pagamento p2 = new Boleto();
        Pagamento p3 = new Pix();

        p1.processarPagamento();
        p2.processarPagamento();
        p3.processarPagamento();
    }
}
