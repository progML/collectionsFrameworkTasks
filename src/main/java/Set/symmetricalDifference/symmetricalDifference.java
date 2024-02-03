package Set.symmetricalDifference;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class symmetricalDifference {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] string1 = reader.readLine().split(" "), string2 = reader.readLine().split(" ");
        Set<Integer> set1 = new HashSet<>(), set2 = new HashSet<>();
        for (String s : string1)
            set1.add(Integer.valueOf(s));
        for (String s : string2)
            set2.add(Integer.valueOf(s));
        symDifference(set1, set2).forEach(System.out::println);
    }

    public static Set<Integer> symDifference(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> res = new HashSet<>(set2);
        set2.removeIf(set1::contains);
        set1.removeIf(res::contains);
        set1.addAll(set2);
        return set1;
    }

}
