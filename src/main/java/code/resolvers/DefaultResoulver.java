package code.resolvers;

import code.Main;
import code.Questions;
import code.Response;

import java.util.Collections;
import java.util.List;

public class DefaultResoulver extends  Resoulver{

    public static DefaultResoulver INSTANCE = new DefaultResoulver();

    private DefaultResoulver(){}

    @Override
    public void apply(List<Response> allMessage, Questions newMessage) {
        switch (newMessage.type){
            case MULTIPART -> multipartResolver(allMessage, newMessage);
            case SINGLE -> {
                List<String> list = new java.util.ArrayList<>(List.copyOf(newMessage.variant));
                Collections.shuffle(list);
                String s = list.get(0);
                Response response = new Response(newMessage, s);
                allMessage.add(response);
            }
        }

    }

    private void multipartResolver(List<Response> allMessage, Questions newMessage) {
        List<String> list = new java.util.ArrayList<>(List.copyOf(newMessage.variant));
        Collections.shuffle(list);

        int count = ((int)(Math.random() * 10) % 2 == 0) ? 2 : 3;
        list.stream().limit(count).map(it -> new Response(newMessage, it)).forEach(allMessage::add);

    }
}
