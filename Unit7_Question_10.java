
/**
 * Write a description of class Unit7_Question_10 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Unit7_Question_10
{
    /** Precondition: firstList.size() == secondList.size() */

public static boolean isReversed(ArrayList<Integer> firstList,
ArrayList<Integer> secondList)
{
for (int j = 0; j < firstList.size() / 2; j++)
{
if (firstList.get(j) != secondList.get(secondList.size() - 1 - j))
{
return false;
}
}
return true;
}
/**
 * Answer:When firstList is {1, 3, 5, 7} and secondList is {5, 5, 3, 1}
 * 
 * Why this won't work. The loop will iterate two times. Therefore, the 1 in 
 * firstList will becompared with the 1 in secondList and the 3 in firstList 
 * will be compared with the 3 in secondList.These pairs are equal, so the method 
 * returns true even though the last element of firstList is not equal to the 
 * first element of secondList.
 */
}
