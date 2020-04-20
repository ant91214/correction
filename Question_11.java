
/**
 * Write a description of class Question_11 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Question_11
{
    boolean duplicates = false;
for (int x = 0; x < arr.length - 1; x++)
{
/* missing loop header */
{
if (arr[x] == arr[y])
{
duplicates = true;
}
}
}
/**
 * Answer:for (int y = x + 1; y < arr.length; y++)
 * 
 * What I chose:for (int y = x + 1; y <= arr.length; y++)
 * 
 * Why I got it wrong: this will cause an ArrayIndexOutOfBoundsException
 * as during the last interation it will produce an element that it is outside 
 * of the array
 */
}
