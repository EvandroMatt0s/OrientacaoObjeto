package apps;

public class Telegram extends ServicoMensagemInstantanea {
    @Override
    public void enviarMensagem() {
        validarConectandoAinternet();
        System.out.println("Enviando Menssagem pelo Telegran Messenger");
    }

    @Override
    public void receberMensagem() {
        System.out.println("Recebendo Menssagem pelo Telegran Messenger");

    }
}
