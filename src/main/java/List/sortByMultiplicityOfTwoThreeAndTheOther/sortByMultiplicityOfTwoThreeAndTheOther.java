package List.sortByMultiplicityOfTwoThreeAndTheOther;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class sortByMultiplicityOfTwoThreeAndTheOther {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String allElements = reader.readLine();
        List<Integer> bigList = createBigList(allElements);

        ArrayList<Integer> div2list = bigList.stream().filter(i -> i % 2 == 0 ).collect(Collectors.toCollection(ArrayList::new));
        ArrayList<Integer> div3list = bigList.stream().filter(i -> i % 3 == 0).collect(Collectors.toCollection(ArrayList::new));
        ArrayList<Integer> otherlist = bigList.stream().filter(i -> i % 3 != 0 && i % 2 != 0).collect(Collectors.toCollection(ArrayList::new));

        //add the necessary elements from bigList to div2list,div3list,otherlist and sort all three lists

        //get result list from createListOfLists
        List<List<Integer>> resultList = createListOfLists(div2list, div3list, otherlist);

        //call printInLine() for resultList
//        printInLine(resultList);
    }

    public static List<Integer> createBigList(String str) {
        List<Integer> bigList = new ArrayList<Integer>();
        String[] strarr = str.split(" ");
        for (String s : strarr) {
            bigList.add(Integer.parseInt(s)); //convert(using Integer.parseInt(s) or Integer.valueOf(s)) and add all elements from srtarr to bigList
        }
        Collections.sort(bigList);
        return bigList;
    }

    public static List<List<Integer>> createListOfLists(List<Integer> div2list, List<Integer> div3list, List<Integer> otherList) {
        //add all lists like items in resultList(list of lists) and return it, first-div2list, second-div3list, third-otherList
        List<List<Integer>> resultList = new ArrayList<>(Collections.singletonList(div2list));
        resultList.add(div3list);
        resultList.add(otherList);

        return resultList;
    }
}
