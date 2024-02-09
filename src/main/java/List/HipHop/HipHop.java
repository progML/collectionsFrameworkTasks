package List.HipHop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class HipHop {
    public static void main(String[] args) throws IOException, IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<String> list = Arrays.stream(reader.readLine().split("\\s")).collect(Collectors.toList());
        for (String i : list) {
            if (i.equals("Hip")) {
                System.out.println(i);
                System.out.println("Hop");
            } else {
                System.out.println(i);
            }
        }
    }
}
