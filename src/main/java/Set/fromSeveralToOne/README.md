Task 1:

Given one input string as "1 2 3 4 5;6 7 8 9 10;11 12 13 14 15"(it's 3 lists)

Task 2:

String[] sets consists of these lists. Add all elements from each list to correct set(see the comments in the code) sets[0] = {"1 2 3 4 5"} - its string and so on
*use split(" ") to separate elements from string

Task 3:

On unionTreeLargeNumber(Set<Integer> set1,Set<Integer> set2,Set<Integer> set3):
1)In each Set find the maximum element
2)create TreeSet, add the resulting elements to TreeSet
3)return this TreeSet with elements sorted in descending order:


Sample Input:

6 11 9 18 10;12 13 19 8 16;3 4 5 15 20

Sample Output:

20
19
18