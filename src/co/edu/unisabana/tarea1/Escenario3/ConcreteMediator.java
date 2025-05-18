package co.edu.unisabana.tarea1.Escenario3;

import java.util.List;

public class ConcreteMediator implements Mediator {
    private List<User> users;

    public ConcreteMediator(List<User> users){
        this.users=users;
    }

    @Override
    public void notify(User sender, String message) {
        for (User user: users){
            if(user != sender){
                user.receiveMessage(message);
            }
        }
    }
}
