package code.resolvers;

import code.Questions;
import code.Response;

import java.util.Collections;
import java.util.List;

public class Q3Resolver extends Resoulver{
    public static Q3Resolver INSTANCE = new Q3Resolver();

    private Q3Resolver() {}

    @Override
    public void apply(List<Response> allMessage, Questions newMessage) {
        boolean isDa = allMessage.stream().anyMatch(it -> it.getType().equals(Questions.Q2) && !it.getValue().equals("Нет,+не+работал"));
        boolean isDaa = allMessage.stream().anyMatch(it -> it.getType().equals(Questions.Q2) && it.getValue().equals("Нет,+не+работал"));

        List<String> listCopy = new java.util.ArrayList<>(List.copyOf(newMessage.variant));
        Collections.shuffle(listCopy);

        if (isDa){
            listCopy.removeIf(it -> it.equals("Работа+с+официальным+трудовым+договором"));
        }
        if (isDaa){
            allMessage.add(new Response(newMessage, "Работа+с+официальным+трудовым+договором"));
        } else {
            String firstResponse = listCopy.stream().findFirst().get();
            allMessage.add(new Response(newMessage, firstResponse));
        }

    }
}
