package code.resolvers;

import code.Questions;
import code.Response;

import java.util.List;

public abstract class Resoulver {

    public void apply(List<Response> allMessage, Questions newMessage){};
}
