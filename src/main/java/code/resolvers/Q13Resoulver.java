package code.resolvers;

import code.Questions;
import code.Response;

import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Q13Resoulver extends Resoulver{
    public static Q13Resoulver INSTANCE = new Q13Resoulver();

    private Q13Resoulver() {}

    @Override
    public void apply(List<Response> allMessage, Questions newMessage) {
        Response q12 = null;
        for (Response response : allMessage) {
            if (response.getType().equals(Questions.Q12))
                q12 = response;
        }

        if (q12 == null) {
            throw new RuntimeException();
        }


        List<String> list = newMessage.variant;
        List<String> listBS = List.of("Бакалавриат", "Специалитет");
        List<String> listMA = List.of("Магистратура", "Аспирантура");

        Random rand = new Random();
        switch (q12.getValue()) {
            case "17-19" -> allMessage.add(new Response(newMessage, listBS.get(rand.nextInt(listBS.size()))));
            case "20-22" -> allMessage.add(new Response(newMessage, listBS.get(rand.nextInt(listBS.size()))));
            case "23-25" -> allMessage.add(new Response(newMessage, list.get(rand.nextInt(list.size()))));
            case "26-28" -> allMessage.add(new Response(newMessage, listMA.get(rand.nextInt(listMA.size()))));
            case "29+и+старше" -> allMessage.add(new Response(newMessage, listMA.get(rand.nextInt(listMA.size()))));
        }

    }
}
