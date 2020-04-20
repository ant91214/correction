
/**
 * Write a description of class Question_9 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Question_9
{
   public class Toy
{
    private int yearFirstSold;

    public int getYearFirstSold()
    {
        return yearFirstSold;
    }

    /* There may be instance variables, constructors, and other methods not shown. */
 }
//The following code segment, which appears in a class other than Toy,   prints the year each Toy object in toyArray was first sold by its manufacturer. Assume that toyArray is a properly declared and initialized array of Toy objects.
for (Toy k : toyArray)
{
System.out.println(k.getYearFirstSold());
} 
/**
 * Answer: for (int k = 0; k < toyArray.length; k++)
 * {
 *  System.out.println(toyArray[k].getYearFirstSold());
 *  }
 *  This is correct as it uses the control variable k as an index
 *  to toyArray and the expression toyArray[k] as the required Toy object
 *  reference for the getYearFirstSold method call
 *  
 *  Answer I chose: I chose for (int k = 0; k < toyArray.length; k++)
 *  {
 *      System.out.println(k.getYearFirstSold());
 *  }
 *  This is answer is clearly incorrect as it doesn't state toy array
 */
}
