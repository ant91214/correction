
/**
 * Write a description of class Question_14 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Question_14
{
    public int positionOfFirstNegative(int[] values)
{
int index = 0;
while (values[index] >= 0)
{
index++;
}
return index;
}
/**Answer:The array values must contain at least one negative integer.
 * 
 * this is beacuse In order for the method to work as intended, the array 
 * cannot be empty and there must be at least one negative integer in the
 * array.
 * 
 */
}
