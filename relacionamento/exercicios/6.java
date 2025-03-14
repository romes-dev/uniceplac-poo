interface Notificacao {
    void enviarMensagem();
}

class Email implements Notificacao {
    @Override
    public void enviarMensagem() {
        System.out.println("Enviando notificação por E-mail.");
    }
}

class SMS implements Notificacao {
    @Override
    public void enviarMensagem() {
        System.out.println("Enviando notificação por SMS.");
    }
}

class PushNotification implements Notificacao {
    @Override
    public void enviarMensagem() {
        System.out.println("Enviando notificação por Push Notification.");
    }
}

public class Main {
    public static void main(String[] args) {
        Notificacao email = new Email();
        Notificacao sms = new SMS();
        Notificacao push = new PushNotification();

        email.enviarMensagem();
        sms.enviarMensagem();
        push.enviarMensagem();
    }
}
