package Set.removeAllNumbersMoreThan10;

import javax.swing.text.html.HTMLDocument;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class removeAllNumbersMoreThan10 {

    public static void main(String[] args) throws IOException, IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] strings = reader.readLine().split(" ");
//        List<Integer> helpList = getList();
        Set<Integer> set = new HashSet<>();
        for (String str : strings) {
            set.add(Integer.parseInt(str));
        }
//        set.addAll(helpList);
        set = removeAllNumbersMoreThan10(set);
        set.forEach(System.out::println);
    }

    public static Set<Integer> removeAllNumbersMoreThan10(Set<Integer> set) {
        set = set.stream().filter(i -> i <= 10).collect(Collectors.toCollection(HashSet::new));
        //put your code here
        return set;
    }

}
