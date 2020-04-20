

/**
 * Write a description of class Question_2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Question_2
{
   
    public int[] transform(int[] a)
{
    a[0]++;
    a[2]++;
    return a;
}
    public void othermethod(){
    int[] arr = {0, 0, 0, 0};
    //or int[] arr = new int[4];
    //These two code segments produce the intended result and contain four zeros 
    // the second code "int[] arr = new int[0];" doesn't work because it 
    //creates a new array length of zero
 
    arr = transform(arr);
}
}
