package apps;

import apps.ServicoMensagemInstantanea;

public class MSNMenssenger  extends ServicoMensagemInstantanea {

    @Override
    public void enviarMensagem() {
        validarConectandoAinternet();
        System.out.println("Enviando Menssagem pelo MSN Messenger");
    }

    @Override
    public void receberMensagem() {
        System.out.println("Recebendo Menssagem pelo MSN Messenger");
    }
}
