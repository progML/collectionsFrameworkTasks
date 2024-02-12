Task 1:
On spliteratorWork( List<Double> lst ):
-using Spliterator add to List<Double> sqrts all square roots of items from lst ,if this item greater than 1
-use Math.sqrt(number) to find square root : Math.sqrt(4)-> 2.0

Task 2:
On print(List<Double> list):
-get spliterator() of given list
-divide spliterator into 2 parts ( use spliterator.trySplit())
-print all items which >=2 from first part (use .println())
-print empty string
-print all items which >=10 from second part (use .println())

Sample Input:

4 4 4 100 100 100

Sample Output:

2.0
2.0
2.0

10.0
10.0
10.0