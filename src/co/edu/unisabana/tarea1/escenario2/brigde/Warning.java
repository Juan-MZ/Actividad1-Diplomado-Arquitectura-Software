package brigde;

public class Warning extends TipoNotification {

    private Platform platform;

    public Warning(Platform platform) {
        super(platform);
        this.platform = platform;
    }

    @Override
    public void showMessage(String message) {
        platform.showMessage(message);
    }
}
