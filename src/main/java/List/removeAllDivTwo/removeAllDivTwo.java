package List.removeAllDivTwo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class removeAllDivTwo {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = reader.readLine().split(" ");
        List<Integer> list = new ArrayList<>();
        for (String i : arr) {
            int temp = Integer.parseInt(i);
            if ((temp & 1) != 0)
                list.add(temp);
        }
        Collections.sort(list);
        list.forEach(System.out::println);
    }
}
