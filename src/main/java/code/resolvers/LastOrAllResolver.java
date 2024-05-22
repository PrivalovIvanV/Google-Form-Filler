package code.resolvers;

import code.Questions;
import code.Response;

import java.util.Collections;
import java.util.List;

public class LastOrAllResolver  extends Resoulver{

    public static LastOrAllResolver INSTANCE = new LastOrAllResolver();

    private LastOrAllResolver() {}

    @Override
    public void apply(List<Response> allMessage, Questions newMessage) {
        List<String> list = newMessage.variant;
        List<String> listCopy = new java.util.ArrayList<>(List.copyOf(newMessage.variant));
        Collections.shuffle(listCopy);

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
