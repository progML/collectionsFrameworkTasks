package Set.fromSeveralToOne;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class fromSeveralToOne {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] sets = reader.readLine().split(";");


        TreeSet<Integer> set1 = new TreeSet<>();
        //your code(add elements to set1 from sets[0])
        for (String i : sets[0].split(" ")) {
            set1.add(Integer.parseInt(i));
        }
        TreeSet<Integer> set2 = new TreeSet<>();
        //your code(add elements to set2 from sets[1])
        for (String i : sets[1].split(" ")) {
            set2.add(Integer.parseInt(i));
        }
        TreeSet<Integer> set3 = new TreeSet<>();
        //your code(add elements to set3 from sets[2])
        for (String i : sets[2].split(" ")){
            set3.add(Integer.parseInt(i));
        }
        Set<Integer> resultTreeSet = unionTreeLargeNumber(set1,set2,set3);
        //print elements of resultTreeSet(using System.out.printLn()) below
        resultTreeSet.forEach(System.out::println);
    }

    public static NavigableSet<Integer> unionTreeLargeNumber(TreeSet<Integer> set1, TreeSet<Integer> set2, TreeSet<Integer> set3) {
        TreeSet<Integer> resultSet = new TreeSet<>();
        resultSet.add(set1.last());
        resultSet.add(set2.last());
        resultSet.add(set3.last());
        return resultSet.descendingSet();
    }
}
