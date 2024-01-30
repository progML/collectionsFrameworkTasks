package List.carriageReturn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class carriageReturn {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
        LinkedList<Integer> ll = new LinkedList<>();
        for (String i : str.split(" ")) {
            ll.addFirst(Integer.parseInt(i));
        }
        Collections.sort(ll);
        for (int i = 0; i < ll.size() - 3; i++) {
            System.out.println(ll.get(i));
        }
    }
}
