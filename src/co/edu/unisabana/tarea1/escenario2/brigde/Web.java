package brigde;


public class Web implements IPlatform {
    @Override
    public void showMessage(String message) {
        System.out.println(String.format("[Web] Message %s", message));
    }
}
