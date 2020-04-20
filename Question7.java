
/**
 * Write a description of class Question7 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Question7
{
    int[] fibs = new int[10];
fibs[0] = 1;
fibs[1] = 1;

for (int j = 1; j < fibs.length; j++)
{
fibs[j] = fibs[j - 2] + fibs[j - 1];
}

/**Answer:In the for loop header, the initial value of j should be 2.
 * This answer is the correct answer because if this were to start at one it 
 * would cause an error and having it start at 2 would avoid the error
 * 
 * The Answer I chose:The for loop condition should be  j < fibs.length - 1.
 *  This condition doesn't work because the last element doesn't get assigned 
 *  a value
 */
}
