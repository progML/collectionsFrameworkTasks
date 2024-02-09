package List.HipHop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.stream.Collectors;

public class HipHop {
    public static void main(String[] args) throws IOException, IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<String> list = Arrays.stream(reader.readLine().split("\\s")).collect(Collectors.toList());
        ListIterator<String> listIterator = list.listIterator();
        while (listIterator.hasNext()){
            if (listIterator.next().equals("Hip"))
                listIterator.add("Hop");
        }
        list.forEach(System.out::println);
    }
}
