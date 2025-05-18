package brigde;

public class Message extends TipoNotification {

    private Platform platform;
    public Message(Platform platform) {
        super(platform);
        this.platform = platform;
    }

    @Override
    public void showMessage(String message) {
        platform.showMessage(message);
    }
}
