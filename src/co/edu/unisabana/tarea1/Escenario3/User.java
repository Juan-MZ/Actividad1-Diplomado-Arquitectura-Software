package co.edu.unisabana.tarea1.Escenario3;

public class User{
    private Mediator mediator;
    private String name;

    public User(Mediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }

    public void sendMessage (String message){
        mediator.notify(this, message);
    }

    public void receiveMessage (String message){
        System.out.println("El usuario "+ name+ " recibio ese mensaje: "+message);
    }
}
