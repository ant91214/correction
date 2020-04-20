
/**
 * Write a description of class Question_13 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Question_13
{
    int maximum = /*values[0] */;
for (int k = 1; k < values.length; k++)
{
if (values[k] > maximum)
{
maximum = values[k];
}
}
System.out.println(maximum);
/**Answer:values[0]
 * The code segment compares each integer in the array after the first to 
 * maximum.If an integer is the maximum integer found so far, maximum is 
 * assigned that integer. By initializing maximum to values[0],
 * the first element in the array will be the maximum integer found so far
 * 
 * I got the answer wrong as I assumed they were simply looking for the max 
 * value and i failed to realixe that the code was assigning the maximum by
 * compairing to the other numbers
 */
}
