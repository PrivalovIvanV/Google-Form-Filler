package code.resolvers;

import code.Questions;
import code.Response;

import java.util.Collections;
import java.util.List;

public class Q5Resolver extends Resoulver {

    public static Q5Resolver INSTANCE = new Q5Resolver();

    private Q5Resolver() {
    }

    @Override
    public void apply(List<Response> allMessage, Questions newMessage) {

        Response q4 = null;
        for (Response response : allMessage) {
            if (response.getType().equals(Questions.Q4))
                q4 = response;
        }

        if (q4 == null) {
            throw new RuntimeException();
        }


        List<String> list = newMessage.variant;
        List<String> listCopy = new java.util.ArrayList<>(List.copyOf(newMessage.variant));
        Collections.shuffle(listCopy);

        switch (q4.getValue()) {
            case "Менее+5+часов" -> allMessage.add(new Response(newMessage, "100%+времени+на+учебу,+не+работаю"));
            case "От+5+до+10+часов" -> allMessage.add(new Response(newMessage, "75%+времени+на+учебу,+25%+на+работу/подработку"));
            case "От+11+до+20+часов" -> allMessage.add(new Response(newMessage, "50%+времени+на+учебу,+50%+на+работу"));
            case "От+21+до+30+часов" -> allMessage.add(new Response(newMessage, "25%+времени+на+учебу,+75%+на+работу"));
            case "От+31+до+40+часов" -> allMessage.add(new Response(newMessage, "100%+времени+на+работу,+не+учусь"));
        }


    }
}
