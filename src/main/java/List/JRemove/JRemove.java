package List.JRemove;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class JRemove {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<String> list = new ArrayList<>(Arrays.asList(reader.readLine().split(" ")));
        Deque<String> result = new ArrayDeque<>();
        for (String elem : list) {
            if (elem.startsWith("J"))
                result.add(elem.substring(1));
        }

        result.descendingIterator().forEachRemaining(System.out::println);

    }
}