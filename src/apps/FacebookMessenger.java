package apps;

import apps.ServicoMensagemInstantanea;

public class FacebookMessenger  extends ServicoMensagemInstantanea {
    @Override
    public void enviarMensagem() {
        validarConectandoAinternet();
        System.out.println("Enviando Menssagem pelo Facebook Messenger");
    }

    @Override
    public void receberMensagem() {
        System.out.println("Recebendo Menssagem pelo facebook Messenger");
    }
}
