package code;

import java.awt.*;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        String url = "https://docs.google.com/forms/d/e/1FAIpQLSdOen2AyJQck92ohzKJze6-tBF7jXIiYa97EO0gPhDmRXy3zQ/formResponse?usp=pp_url";

        for (int i = 0; i < 1111; i++){
            ArrayList<Response> list = new ArrayList<>();
            for (Questions value : Questions.values()) {
                value.resoulve(list);
            }
//            System.out.println(collect(list));

            try {
                URLConnection connection = new URL(url + collect(list)).openConnection();
                connection.connect();
                InputStream inputStream = connection.getInputStream();
                while (inputStream.available() > 0) {
                    System.out.println(inputStream.read());
                }
            } catch (IOException e) {
                System.out.println("Couldn't open connection");
            }

        }

    }

    static List<Integer> copyList(List<Integer> source) {
        List<Integer> destination = new ArrayList<>(source.size());
        Collections.copy(destination, source);
        return destination;
    }

    static String collect(ArrayList<Response> list){
        String collect = list.stream()
                .map(it -> "&entry." + it.type.number + "=" + it.value)
                .map(it -> it.replaceAll("%", "%25")).collect(Collectors.joining());
        return collect;
    }
}
