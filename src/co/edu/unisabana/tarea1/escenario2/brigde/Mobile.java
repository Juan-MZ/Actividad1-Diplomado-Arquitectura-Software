package brigde;


public class Mobile implements IPlatform {
    @Override
    public void showMessage(String message) {
        System.out.println(String.format("[Mobile] Message %s", message));
    }
}
