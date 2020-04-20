
/**
 * Write a description of class Unit7_Question_13 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Unit7_Question_13
{
    public static int sequentialSearch(ArrayList<Integer> elements, int target)
{
for (int j = 0; j < elements.size(); j++)     // Line 3
{
if (elements.get(j) == target)
{
return j;
}
}
return -1;
}
/*Which of the following explains how replacing Line 3 with for 
(int j = (elements.size() - 1); j >= 0; j--) will affect the behavior of 
sequentialSearch?*/
/**Answer: The modified method will return the index of the last appearance of the
 * target value in the list, or -1 if the target value does not appear in the list.
 *  
 *  What I wrote: The modified method will throw an ArrayIndexOutOfBoundsException.
 *  
 *  Why my answer is wrong: The given code will not throw an
 *  ArrayIndexOutOfBoundsException.
 *  
 */


}
