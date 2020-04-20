
/**
 * Write a description of class Question_3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Question_3
{
    
   public static int checkString(String[] arr)
{
int count = 0;
for (int k = 0; k < arr.length; k++)
{
if (arr[k].length() >= 3)
{
count++;
}
}
return count;
}

/**
*checkString(new String[0]);
*
*String[] str = {"cat", "dog"};
*checkString(str);
*
*Both of these statments would compile as there isn't anything missing 
*However the statement "checkString(new String[]);" wouldn't compile as it is 
*missing the array size.
**/
}



