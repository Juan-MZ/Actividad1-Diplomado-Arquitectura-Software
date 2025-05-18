package brigde;

public class Message extends TipoNotification {

    private IPlatform IPlatform;
    public Message(IPlatform IPlatform) {
        super(IPlatform);
        this.IPlatform = IPlatform;
    }

    @Override
    public void showMessage(String message) {
        IPlatform.showMessage(message);
    }
}
