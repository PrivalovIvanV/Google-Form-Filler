package code.resolvers;

import code.Questions;
import code.Response;

import java.util.Collections;
import java.util.List;

public class Q11Resoulver extends Resoulver{

    public static Q11Resoulver INSTANCE = new Q11Resoulver();

    private Q11Resoulver() {}

    @Override
    public void apply(List<Response> allMessage, Questions newMessage) {

        Response q10 = null;
        for (Response response : allMessage) {
            if (response.getType().equals(Questions.Q10))
                q10 = response;
        }

        if (q10 == null) {
            throw new RuntimeException();
        }



        List<String> list = newMessage.variant;
        List<String> listCopy = new java.util.ArrayList<>(List.copyOf(newMessage.variant));
        Collections.shuffle(listCopy);

        if (q10.getValue().equals("Абсолютно+исключено,+только+официальное+трудоустройство"))
            listCopy.removeIf(it -> it.equals("Никакие+соображения+не+заставят,+готов(а)+работать+неофициально"));

        String lastResponse = listCopy.get(listCopy.size() - 1);

        if (lastResponse.equals(list.get(list.size() - 1))) {
            allMessage.add(new Response(newMessage, lastResponse));
        }else {
            listCopy.removeIf(it -> it.equals(list.get(list.size() - 1)));
            int count = ((int)(Math.random() * 10) % 2 == 0) ? 2 : 3;
            listCopy.stream().limit(count).forEach(it -> allMessage.add(new Response(newMessage, it)));
        }

    }
}
