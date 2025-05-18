package co.edu.unisabana.tarea1.Escenario3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<User> users= new ArrayList<>();
        ConcreteMediator mediator = new ConcreteMediator(users);

        User user1 = new User(mediator, "Pedro");
        User user2 = new User(mediator, "Daniel");
        User user3 = new User(mediator, "Juan Pablo");

        users.add(user1);
        users.add(user2);
        users.add(user3);

        user1.sendMessage("Hola mundo");
    }
}
