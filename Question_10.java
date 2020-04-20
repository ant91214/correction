
/**
 * Write a description of class Question_10 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Question_10
{
 // Consider the following two code segments.

 //I.
int[] arr = {1, 2, 3, 4, 5};
for (int x = 0; x < arr.length; x++)
{
System.out.print(arr[x + 3]);
}

//II.
int[] arr = {1, 2, 3, 4, 5};
for (int x : arr)
{
System.out.print(x + 3);
}
/** Answer:Code segment I will cause an ArrayIndexOutOfBoundsException 
 * and code segment II will print 45678.
 * 
 * The first one prints an index out of bound exception because there isn't
 * a fifth object in the array thus causing an index out of bounds exception
 * and the second prints out 45678 as 3 is added to each of the numbers
 * 
 * 
 */
}
