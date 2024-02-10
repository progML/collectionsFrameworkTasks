package List.JRemove;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class JRemove {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<String> list = new ArrayList<>(Arrays.asList(reader.readLine().split(" ")));
        ListIterator<String> iter = list.listIterator(list.size());
        String temp = "";
        while (iter.hasPrevious()) {
            temp = iter.previous();
            if (temp.startsWith("J")) {
                System.out.println(temp.substring(1));
            }
        }
    }
}