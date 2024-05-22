package code.resolvers;

import code.Questions;
import code.Response;

import java.util.List;
import java.util.Random;

public class Q14Resoulver extends Resoulver{
    public static Q14Resoulver INSTANCE = new Q14Resoulver();

    private Q14Resoulver() {}

    @Override
    public void apply(List<Response> allMessage, Questions newMessage) {
        Response q13 = null;
        for (Response response : allMessage) {
            if (response.getType().equals(Questions.Q13))
                q13 = response;
        }

        if (q13 == null) {
            throw new RuntimeException();
        }


        List<String> list = newMessage.variant;
        List<String> listBac = List.of("1", "2", "3", "4");
        List<String> listMag = List.of("1", "2");

        Random rand = new Random();
        if (q13.getValue().equals("Бакалавриат") || q13.getValue().equals("Магистратура")) {
            switch (q13.getValue()) {
                case "Бакалавриат" -> allMessage.add(new Response(newMessage, listBac.get(rand.nextInt(listBac.size()))));
                case "Магистратура" -> allMessage.add(new Response(newMessage, listMag.get(rand.nextInt(listMag.size()))));
            }
        } else {
            allMessage.add(new Response(newMessage, list.get(rand.nextInt(list.size()))));
        }

    }
}
