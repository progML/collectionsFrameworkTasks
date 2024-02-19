package List.spliterator;

import java.util.*;

public class TaskSpliterator {
    public static List<Double> spliteratorWork(List<Double> lst) {
        List<Double> sqrs = new ArrayList<>();
        Spliterator<Double> spliterator = lst.spliterator();
        spliterator.forEachRemaining(i -> {
            if (i > 1)
                sqrs.add(Math.sqrt(i));
        });
        return sqrs;
    }

    public static void print(List<Double> list) {
        Spliterator<Double> spliterators = list.spliterator();
        Spliterator<Double> secondSplit = spliterators.trySplit();
        secondSplit.forEachRemaining(i -> {
            if (i >= 2)
                System.out.println(i);
        });
        System.out.println();
        spliterators.forEachRemaining(i -> {
            if (i >= 10)
                System.out.println(i);
        });
    }
}
