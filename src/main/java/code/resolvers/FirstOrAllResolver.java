package code.resolvers;

import code.Questions;
import code.Response;

import java.util.Collections;
import java.util.List;

public class FirstOrAllResolver extends Resoulver{

    public static FirstOrAllResolver INSTANCE = new FirstOrAllResolver();

    private FirstOrAllResolver() {}

    @Override
    public void apply(List<Response> allMessage, Questions newMessage) {
        List<String> list = newMessage.variant;
        List<String> listCopy = new java.util.ArrayList<>(List.copyOf(newMessage.variant));
        Collections.shuffle(listCopy);

        String firstResponse = listCopy.get(0);

        if (firstResponse.equals(list.get(0))) {
            allMessage.add(new Response(newMessage, firstResponse));
        }else {
            listCopy.removeIf(it -> it.equals(list.get(0)));
            int count = ((int)(Math.random() * 10) % 2 == 0) ? 2 : 3;
            listCopy.stream().limit(count).forEach(it -> allMessage.add(new Response(newMessage, it)));
        }

    }
}
